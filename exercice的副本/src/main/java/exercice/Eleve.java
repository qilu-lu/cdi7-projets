package exercice;

import java.util.ArrayList;
import java.util.List;

public class Eleve {
	protected String nom;

	public void setNom(String nom) {
		this.nom = nom;
	}

	protected List<Integer> listeNotes = new ArrayList<Integer>();;

	public Eleve(String nom) {
		this.nom = nom;

	}

	public Eleve() {
	}

	public double getMoyenne() {
		Integer sum = 0;
		for (int i = 0; i < listeNotes.size(); i++) {
			sum = sum + listeNotes.get(i);
		}
		double moyenne = sum / listeNotes.size();
		return moyenne;
	}

	public String getNom() {
		return nom;
	}

	public List<Integer> getListeNotes() {
		return listeNotes;
	}

	public void setListeNotes(List<Integer> listeNotes) {
		this.listeNotes = listeNotes;
	}

	public  void ajouterNote(int note) {
		if (note < 0) {
			listeNotes.add(0);
		} else if (note > 20) {
			listeNotes.add(20);
		} else {
			listeNotes.add(note);
		}
	}

	@Override
	public String toString() {
		return "eleve [nom=" + nom + ", listeNotes=" + listeNotes + "]";
	}

	public void add(int i) {
		// TODO Auto-generated method stub

	}
}
