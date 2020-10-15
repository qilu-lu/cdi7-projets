package exercice.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("brice", "0673097777");
		map.put("lu", "0769417777");
		map.put("nico", "066666666");
		map.put("brice", "0673097387");

		// recuperer une vqleur a partir dune cle
		String v = map.get("brice");
		System.out.println(v);

		//Pour voir si une cle existe
		System.out.println(map.containsKey("brice"));
		
		// lister les cles
		for (String key : map.keySet()) {
			System.out.println(key);
			String value = map.get(key);
		}

		// lister les valeurs
		for (String valeur : map.values()) {
			System.out.println(valeur);
		}

		// lister les cles et les valeurs ensemble
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
