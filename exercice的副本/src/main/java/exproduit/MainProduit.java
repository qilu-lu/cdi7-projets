package exproduit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MainProduit {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws ParseException {
		List<Produit> p = new ArrayList<>();
		p.add(new Produit(1, sdf.parse("2020-10-10"), true, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-10"), false, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-11"), false, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-12"), true, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-12"), true, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-13"), true, "EEEE", 10));
		System.out.println(getValide(p));// ==3

	}

	public static int getValide(List<Produit> p) {

		Map<Date, Integer> map = new HashMap<>();

		for (int i = 0; i < p.size(); i++) {

			if (p.get(i).isValide() == true) {
				Integer c = map.get(p.get(i).getDate());
				int count = c == null ? 1 : c + 1;
				map.put(p.get(i).getDate(), count);
			}
		}
		for (Entry<Date, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}

		return map.size();

	}

}
