package Champ;

import java.util.ArrayList;
import java.util.List;

public class Parcelle {

	List<Animal> animaux = new ArrayList<>();
	List<Nourriture> nouriture = new ArrayList<>();

	@Override
	public String toString() {
		String ret = "";
		for (Animal animal : animaux) {
			ret += animal.getClass().getSimpleName() + animal.jourSansManger;
		}
		for (Nourriture animal : nouriture) {
			ret += animal.getClass().getSimpleName();
		}

		return ret;
	}

}
