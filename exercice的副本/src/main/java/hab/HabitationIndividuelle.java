package hab;

public class HabitationIndividuelle extends Habitation {

	// hi特有属性
	private int NbPieces;
	private boolean Piscine;

	public HabitationIndividuelle() {
	}

	public HabitationIndividuelle(String proprietaire, String a, double s, int nbPieces, boolean piscine) {
		setProprietaire(proprietaire);
		setAdress(a);
		setSurface(s);
		setNbPieces(nbPieces);
		setPiscine(piscine);

		// public double impot() {
		// double impot = surface * 2;
		// return impot;
	}

	public void affiche() {
		System.out.println("HabitationIndividuelle [NbPieces=" + NbPieces + ", Piscine=" + Piscine + ", proprietaire="
				+ getProprietaire() + ", adress=" + getAdress() + ", surface=" + getSurface() + "]");
	}

	public int getNbPieces() {
		return NbPieces;
	}

	public void setNbPieces(int nbPieces) {
		NbPieces = nbPieces;
	}

	public boolean isPiscine() {
		return Piscine;
	}

	public void setPiscine(boolean piscine) {
		Piscine = piscine;
	}

}