package exReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ReadFileExercise {
	private static final String filePath1 = "/Users/qilu/Desktop/fichiers input/fr100.txt";
	private static final String filePath2 = "/Users/qilu/Desktop/fichiers input/en100.txt";
	static BufferedReader br = null;

	public static void main(String[] args) throws IOException {
		System.out.println("Read files");
		Map<String, Set<Integer>> frenchMap1 = getWords(filePath1);
		Map<String, Set<Integer>> englishMap1 = getWords(filePath2);
		System.out.println("Remove words less than 10");
		Map<String, Set<Integer>> frenchMap = supprimerWords(frenchMap1);
		Map<String, Set<Integer>> englishMap = supprimerWords(englishMap1);

		System.out.println("Computing..");
		Map<String, String> map3 = computeCorrelation(frenchMap, englishMap );
		System.out.println(map3);
		
		Map<String,List<String>> values = new HashMap<>();
		List<String> list = new ArrayList<>();
		Iterator <String>iterator = map3.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map3.get(key);
			if (map3.containsValue(value)) {
				if (values.containsKey(value)) {
					list =  values.get(value);
				} else {
					list = new ArrayList<>();
				}
				list.add(key);
				values.put(value, list);
			}
		}
		System.out.println("result-----------------------");
		iterator = values.keySet().iterator();
		while (iterator.hasNext()) {
			Object value = iterator.next();
			List result = (List) values.get(value);
			// double correlation = 
			if (result.size() > 0) {
				System.out.println("fr :" + value + "  -> en:" + result.toString());
				//System.out.println(values);
			}
		}
	}

	private static Map<String, String> computeCorrelation(Map<String, Set<Integer>> frenchMap,
			Map<String, Set<Integer>> englishMap) {
		int i = 0;
		Map<String, String> map3 = new TreeMap<String, String>();
		
		for (Entry<String, Set<Integer>> keyen : englishMap.entrySet()) {
			System.out.println((i++) + "/" + englishMap.size());
			String fr = null;
			double maxi = 0.;
			for (Entry<String, Set<Integer>> keyfr : frenchMap.entrySet()) {
				double c = calculerCorrel(keyen.getValue(), keyfr.getValue());
				if (c > maxi) {
					maxi = c;
					fr = keyfr.getKey();
					map3.put(keyen.getKey(), fr+c);
					
				}
			}
		}
		return map3;
	}

	private static Map<String, Set<Integer>> getWords(String filepath) {
		Map<String, Set<Integer>> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			String line = null;
			int j = 0;
			while ((line = br.readLine()) != null) {
				for (String st : line.split(" ")) {
					Set<Integer> jj = null;
					if (!(map.containsKey(st))) {
						jj = new HashSet<Integer>();
						jj.add(j);
						map.put(st, jj);
					} else {
						map.get(st).add(j);
					}
				}
				j++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	public static <T> int tailleIntersection(final Set<T> list1, final Set<T> list2) {
		int ret = 0;
		for (T t : list1) {
			if (list2.contains(t)) {
				ret++;
			}
		}
		return ret;
	}

	private static double calculerCorrel(final Set<Integer> setEn, final Set<Integer> setFr) {
		double correl = tailleIntersection(setEn, setFr) / Math.sqrt(setEn.size() * setFr.size());
		return correl;
	}

	public static Map<String, Set<Integer>> supprimerWords(Map<String, Set<Integer>> map1) {

		for (Iterator<String> iterator = map1.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			if (map1.keySet().size() < 10) {
				map1.remove(key);

			}
		}
		return map1;
	}
}
