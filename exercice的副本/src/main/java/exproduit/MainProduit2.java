package exproduit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainProduit2 {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws ParseException {
		List<Produit> p = new ArrayList<>();
		p.add(new Produit(1, sdf.parse("2020-10-10"), true, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-10"), false, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-11"), false, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-12"), true, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-12"), true, "EEEE", 10));
		p.add(new Produit(1, sdf.parse("2020-10-13"), true, "EEEE", 10));
		System.out.println(getDate(p));// ==3

	}
	public static Date getDate(List<Produit> p) {

		Date key = null;
		for (int i = 0; i <p.size(); i++) {
			int count=0;
		key=p.get(i).getDate();
			if(p.get(i).isValide() == true) {
				count++;
			}
			
		
		System.out.println(key+""+count);

		
	}return key;
		}
	
	
	}
