package hab;

public class HabitationProfessionnelle extends Habitation {
	private int NbEmployes;

	public int getNbEmployes() {
		return NbEmployes;
	}

	public void setNbEmployes(int NbEmployes) {
		this.NbEmployes = NbEmployes;
	}

	public HabitationProfessionnelle() {
	}

	public HabitationProfessionnelle(String proprietaire, String a, double s, int NBEmployes) {
		setProprietaire(proprietaire);
		setAdress(a);
		setSurface(s);
		setNbEmployes(NBEmployes);

	}

	public void affiche() {
		System.out.println("HabitationProfessionnelle [NbEmployes=" + NbEmployes + ", impot()=" + impot()
				+ ", getAdress()=" + getAdress() + ", getSurface()=" + getSurface() + "]");
	}

	public double impot() {
		double impot = super.impot() + getNbEmployes() * 1000;
		return impot;
	}
}
