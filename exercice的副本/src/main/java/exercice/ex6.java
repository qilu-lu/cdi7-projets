package exercice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ex6 {
	private static Integer coucou(Collection<Integer> collection22) {
		Integer Summet = 0;
		for (Integer intn : collection22) {

			Summet = intn + Summet;

		}

		return Summet;

	}

	public static void main(String[] args) {
		Map<String, Integer> n = new HashMap<>();
		n.put("a", 1);
		n.put("b", 2);
		n.put("c", 3);
		n.put("d", 4);
		n.put("e", 5);

		Integer q = coucou(n.values());
		System.out.println(q);

	}
}
