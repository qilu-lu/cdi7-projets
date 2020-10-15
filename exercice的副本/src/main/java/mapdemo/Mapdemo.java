package mapdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapdemo {
	public static void main(String[] args) {
		// Mapfunction();
		tongjiguanjianzichuxiancishu();
	}

	public static void tongjiguanjianzichuxiancishu() {
		final String fileName = "/Users/qilu/eclipse-workspace/exercice/src/main/java/mapdemo/Mapdemo.java";
		final String keywords = "package ,import,public,void,final,static,new,file,if,catch,for,try,return";

		List<String> contenList = ReadSourceFile(fileName);
		Set<String> keywordsSet = new HashSet();
		keywordsSet.addAll(Arrays.asList(keywords.split(",")));
//简单做法String[]keywordsArray=keywords.split("");
		Map<String, Integer> keywordsmap = new HashMap<>();
		for (String keyword : keywordsSet) {// 遍历关键字集合
			keyword=keyword.trim();
			for (String line : contenList) {// 内循环 每个关键字都遍历一次原码的所有行
				// 统计每一行中keyword出现次数
				int count = getLinekeyWordCont(line, keyword);
				// 将count放到map集合中
				if (count == 0)
					continue;
				if (keywordsmap.containsKey(keyword)) {
					int oldCount = keywordsmap.get(keyword).intValue();
					keywordsmap.put(keyword, new Integer(count + oldCount));
				} else {
					keywordsmap.put(keyword, count);
				}
			}
		}//3遍历map集合（以关键字出现的次数来排序）
		for(Map.Entry<String,Integer>entry:keywordsmap.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		//排序
		System.out.println("-----------");
		Map<String,Integer>treemap=new TreeMap<>();
		treemap.putAll(keywordsmap);
		for(Map.Entry<String,Integer>entry:treemap.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
	}
	}
	private static int getLinekeyWordCont(String line, String keyword) {
		if (line == null || line.length() == 0)
			return 0;
		// 可以在这添加其他逻辑判断 比如 跳过注释行
		if (line.startsWith("/")) {
			return 0;
		}
		int count = 0;
		String strLine = new String(line);
		int index = -1;
		while ((index = strLine.indexOf(keyword)) != -1) {
			count++;
			strLine = strLine.substring(index + keyword.length() + 1);
		}
		return count;
	}

	private static List<String> ReadSourceFile(String fileName) {
		List<String> contenList = new ArrayList<>();
		try (FileReader freader = new FileReader(fileName); BufferedReader reader = new BufferedReader(freader);) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.trim().length() == 1)
					continue;
				contenList.add(line.trim());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return contenList;
	}

	public static void Mapfunction() {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Monkey", 18);
		hashMap.put("Nami", 19);
		hashMap.put("sanji", 25);
		hashMap.put("nico", 26);
		hashMap.put("Rorona", 21);

		System.out.println("hashmap" + hashMap);
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Monkey", 18);
		linkedHashMap.put("Nami", 19);
		linkedHashMap.put("sanji", 25);
		linkedHashMap.put("nico", 26);
		linkedHashMap.put("Rorona", 21);
		System.out.println("linkedhashmap" + linkedHashMap);

		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Monkey", 18);
		treeMap.put("Nami", 19);
		treeMap.put("sanji", 25);
		treeMap.put("nico", 26);
		treeMap.put("Rorona", 21);
		System.out.println("treeMap" + treeMap);

		System.out.println("第一中遍历方式，通过map。keyset遍历key，通过key取出valeur");
		for (String key : treeMap.keySet()) {
			System.out.println(key + "--" + treeMap.get(key));
		}
		System.out.println("第二中遍历方式，通过map.entrySet迭代器遍历key和value");
		Set<Map.Entry<String, Integer>> entrySet11 = treeMap.entrySet();
		Iterator<Map.Entry<String, Integer>> entrySetIt = entrySet11.iterator();
		while (entrySetIt.hasNext()) {
			Map.Entry<String, Integer> entry = entrySetIt.next();
			System.out.println(entry.getKey() + "\t\t" + entry.getValue());
		}
		System.out.println("第3中遍历方式,直接遍历map.entrySet集合");
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}

	}

}

class MyTreeComparator implements Comparator<String> {
//map的比较只对key进行
	@Override
	public int compare(String key1, String key2) {
		if (key1.compareTo(key2) > 0) {
			return 1;
		}
		if (key1.compareTo(key2) > 0) {
			return -1;
		}
		return 0;
	}

}
