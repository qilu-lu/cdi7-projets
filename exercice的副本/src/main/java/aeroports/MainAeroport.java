package aeroports;

public class MainAeroport {
	public static void main(String[] args) {

		Pays france = new Pays("France");
		Ville paris = new Ville("Paris");
		Ville lyon = new Ville("Lyon");
		
		france.ville.add(paris);
		france.ville.add(lyon);

		Aeroport cdg = new Aeroport("CDG", 12);
		Aeroport orly = new Aeroport("Orly", 12);
		paris.aeroport.add(orly);
		paris.aeroport.add(cdg);
		//

		Pays chine = new Pays("Chine");
		Ville shanghai = new Ville("shanghai");
		Ville beijing = new Ville("beijjing");
		chine.ville.add(beijing);
		chine.ville.add(shanghai);
		Aeroport pek = new Aeroport("pek", 80);
		Aeroport pudong = new Aeroport("Pudong", 90);
		Aeroport hongqiao = new Aeroport("hongqiao", 900);
		shanghai.aeroport.add(hongqiao);
		shanghai.aeroport.add(pudong);
		beijing.aeroport.add(pek);
		//
		Pays coree = new Pays("Coree");
		Ville souel = new Ville("souel");
		coree.ville.add(souel);
		Aeroport incheon = new Aeroport("incheon", 88);
		souel.aeroport.add(incheon);
		//

		Pays Etatsunis = new Pays("Etats-unis");
		Ville washington = new Ville("washington");
		Ville lasvegas = new Ville("lasvegas");
		Etatsunis.ville.add(washington);
		Etatsunis.ville.add(lasvegas);
		Aeroport lasvagasairport = new Aeroport("lasvagas airport", 120);
		Aeroport iad = new Aeroport("iad", 121);
		Aeroport dca = new Aeroport("dca", 125);
		washington.aeroport.add(dca);
		washington.aeroport.add(iad);
		lasvegas.aeroport.add(lasvagasairport);

		System.out.println(france);
	}
}
