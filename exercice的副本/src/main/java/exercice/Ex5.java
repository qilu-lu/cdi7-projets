package exercice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex5 {
	public static void main(String[] args) {
		Map<String, Integer> n = new HashMap<>();
		n.put("a", 1);
		n.put("b", 2);
		n.put("c", 3);
		n.put("d", 4);
		n.put("e", 5);

		List<Integer> valeurs = new ArrayList<>();

		for (Integer valeur : n.values()) {
			valeurs.add(valeur);
		}
		System.out.println(Ex4.summe(valeurs));
		
	}
}
