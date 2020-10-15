package exercice;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {

	private static int compter(List<String> mots, String mot) {
		Integer total = 0;
		for (int i = 0; i < mots.size(); i++) {
			if (mots.get(i).equals(mot)) {
				total = total + 1;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		List<String> motsS = new ArrayList<>();
		motsS.add("lys");
		motsS.add("lys");
		motsS.add("lys");
		motsS.add("table");
		motsS.add("papier");
		motsS.add("ane");
		motsS.add("lys");
		System.out.println(compter(motsS, "lys"));
		// compter le nombre de mots dans "mots"
	}
}
