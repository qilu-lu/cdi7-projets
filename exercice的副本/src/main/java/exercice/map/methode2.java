package exercice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class methode2 {
	public static void main(String[] args) {
		List<String> sacs = new ArrayList<>();
		sacs.add("channel");
		sacs.add("channel");
		sacs.add("channel");
		sacs.add("channel");
		sacs.add("louis vuitton");
		sacs.add("louis vuitton");
		sacs.add("hermes");
		Map<String, Integer> map = new HashMap<>();
		for (String marque : sacs) {
			map.put(marque, countChar(sacs, marque));
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " have " + entry.getValue());
		}

	}

	public static int countChar(List<String> sacs, String marque) {

		int count = 0;
		for (int i = 0; i < sacs.size(); i++) {
			String sac = sacs.get(i);

			if (marque.equals(sac)) {
				count++;
			}
		}
		return count;

	}
}
