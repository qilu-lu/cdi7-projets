package anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder {
	public static void main(String[] args) {
		String file = "/Users/qilu/Desktop/words.txt";
		List<String> words = lireMots(file);

		List<Anagram> anagrams = chercherAnagram(words.toArray(new String[0]));
		for (Anagram anagram : anagrams) {
			System.out.println(anagram.getWords() + " : " + anagram.getAnagrams());
		}
	}

	public static List<String> lireMots(String file) {
		List<String> words = new ArrayList<String>();
		try (BufferedReader lecteurAvecBuffer = new BufferedReader(new FileReader(file))) {
			String ligne;
			while ((ligne = lecteurAvecBuffer.readLine()) != null) {
				words.addAll(Arrays.asList(ligne.split(" ")));
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		words.removeIf(e -> "".equals(e.strip()));
		return words;
	}

	public static boolean isAnagram(String a, String b) {
		a = a.strip();
		b = b.strip();

		if (a.length() != b.length()) {
			return false;
		} else {
			List<String> charA = new ArrayList<String>(Arrays.asList(a.split("")));
			List<String> charB = new ArrayList<String>(Arrays.asList(b.split("")));
			Collections.sort(charA);
			Collections.sort(charB);
			return charA.equals(charB);
//			int k = 0;
//			int f = 0;
//			for (int i = 0; i < a.length(); i++) {
//				int value = a.charAt(i) - 97;
//				k = k + value;
//			}
//			for (int i = 0; i < b.length(); i++) {
//				char value = b.charAt(i);
//				f = f + (int) value;
//			}
//			if (k == f) {
//				for (int i = 0; i < a.length(); i++) {
//					// boolean contains=b.contains(""+a.charAt(i));
//					boolean contains = b.indexOf(a.charAt(i)) >= 0;
//
//					if (contains) {
//						return true;
//					} else {
//						return false;
//					}
//
//				}
//
//			} else {
//				return false;
//			}

		}

	}

	public static List<Anagram> chercherAnagram(String[] v) {

		Map<String, Anagram> map = new HashMap<>();
		for (int i = 0; i < v.length; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (isAnagram(v[i].strip(), v[j].strip())) {
					if (map.containsKey(v[i])) {
						map.get(v[i]).addAnagrams(v[j]);
					} else {
						Anagram a = new Anagram();
						a.setWords(v[i]);
						a.addAnagrams(v[j]);
						map.put(v[i], a);
					}
				}
			}
		}

		return new ArrayList<>(map.values());

	}

}
