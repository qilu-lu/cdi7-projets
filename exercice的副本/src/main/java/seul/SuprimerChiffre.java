package seul;

import java.util.ArrayList;
import java.util.List;

public class SuprimerChiffre {
	public static void main(String[] args) {

		List<String> liste = new ArrayList<String>();
		liste.add("A");
		liste.add("B");
		liste.add("C");
		liste.add("D");
		liste.add("E");
		supprimer(liste);
		System.out.println(liste);
	}

	public static void supprimer(List<String> liste) {
		for (int i = 0; i < liste.size(); i++) {
			liste.remove(i);
		}
	}

}
