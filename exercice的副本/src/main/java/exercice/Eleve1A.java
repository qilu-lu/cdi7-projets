package exercice;

public class Eleve1A extends EleveECTS {

	public Eleve1A(String nomDDDD) {
		super.nom = nomDDDD;
	}

	public int resultat() {

		if (super.getMoyenne() >= 12) {
			return 60;

		}

		return 0;
	}

}
