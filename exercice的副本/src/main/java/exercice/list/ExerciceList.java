package exercice.list;

import java.util.ArrayList;
import java.util.List;


public class ExerciceList {

	// Supprimer un element sur deux dans une liste.
	// si A, B, C, D, E => A, C, E
	public static void remove(List<String> liste) {
		for (int i = 1; i < liste.size(); i++) {
			liste.remove(i);
		}
	}

	public static void main(String[] args) {
		List<String> liste = new ArrayList<String>();
		liste.add("A");
		liste.add("B");
		liste.add("C");
		liste.add("D");
		liste.add("E");
		liste.add("F");
		liste.add("G");
		
		remove(liste);
		
		System.out.println(liste);

		//liste.remove(0);
	}
}
