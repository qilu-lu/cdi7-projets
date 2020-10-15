package exercice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map2 {
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
		
		for (String sac : sacs) {
			Integer nb=map.get(sac);
			if(nb==null) {
				map.put(sac, 1);
			}else {
				map.put(sac, nb+1);
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " have " + entry.getValue());
		}
	}
}
