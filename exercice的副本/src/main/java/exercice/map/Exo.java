package exercice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exo {

	public static void main(String[] args) {
		List<String> sac = new ArrayList<>();
		sac.add("channel");
		sac.add("channel");
		sac.add("channel");
		sac.add("channel");
		sac.add("louis vuitton");
		sac.add("louis vuitton");
		sac.add("hermes");
		
		//////////
		//Iterator pareil que for()
		Iterator<String> i=sac.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//
		for(String s:sac) {
			System.out.println(s);
		}
		//////////////

		Map<String, Integer> map = new HashMap<>();

//code
		for (String marque : sac) {
			Integer num = map.get(marque);
			map.put(marque, num == null ? 1 : num + 1);
		}
		Set set = map.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) it.next();

			System.out.print(entry.getKey() + "have" + entry.getValue());
		}
	}

	// channel 4
	// LV 2
	// hermes 1
}
