package exercice;

import java.util.ArrayList;
import java.util.List;



public class Groupeleves {

	private List<Eleve> listeEleves = new ArrayList<>();

	public int nombre() {
		return listeEleves.size();
	}

	public List<Eleve> getListe() {
		return listeEleves;
	}
	//

	public void ajouterEleve(Eleve eleve) {
		listeEleves.add(eleve);

	}

	// eleve为什么要declarer 下面不用

	public Eleve chercher(String Nom) {
		for (Eleve eleve : listeEleves) {
			if (eleve.getNom().equals(Nom)) {
				return eleve;
			
			}
		}
		return null;
//		for (int i = 0; i < listeEleves.size(); i++) {
//			if (listeEleves.get(i).equals(Nom)) {
//				return listeEleves.get(i);
//			}
//		}
//		return null;
	}
	// for（String nom ：listeEleves）{
	// if（nom equals(Nom)){
	// return nom;

	// else {
	// return null;

	public void lister() {

		System.out.println(listeEleves.toString());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listeEleves == null) ? 0 : listeEleves.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Groupeleves other = (Groupeleves) obj;
		if (listeEleves == null) {
			if (other.listeEleves != null)
				return false;
		} else if (!listeEleves.equals(other.listeEleves))
			return false;
		return true;
	}

}
