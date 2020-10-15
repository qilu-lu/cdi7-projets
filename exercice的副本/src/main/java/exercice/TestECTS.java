package exercice;

import java.util.ArrayList;
import java.util.List;

public class TestECTS {

	public static void main(String[] args) {

		EleveECTS marie = new Eleve1A("Marie");
		EleveECTS hugues = new EleveMaster("Hugues");
		EleveECTS sophie = new EleveMaster("Sophie");
		marie.ajouterNote(60);
		marie.ajouterNote(40);
		hugues.ajouterNote(18);
		hugues.ajouterNote(22);
		sophie.ajouterNote(55);
		sophie.ajouterNote(65);
		List<EleveECTS> eleveECTS = new ArrayList<>();
		eleveECTS.add(marie);
		eleveECTS.add(hugues);
		eleveECTS.add(sophie);

		for (EleveECTS eleveECTS2 : eleveECTS) {
			System.out.println(eleveECTS2.nom+":"+eleveECTS2.resultat());

		}

	}

}
