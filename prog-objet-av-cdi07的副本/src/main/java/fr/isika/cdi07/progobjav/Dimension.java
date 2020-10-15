package fr.isika.cdi07.progobjav;

public enum Dimension {
	UN(1, "une dimension"), DEUX(2, "Deux dimension"), Trois(3, "Trois dimension");

	private final int valeur;
	private final String texte;

	private Dimension(int valeur, String texte) {
		this.valeur = valeur;
		this.texte = texte;
	}

	public int getValeur() {
		return valeur;
	}

	public String getTexte() {
		return texte;
	}

}
