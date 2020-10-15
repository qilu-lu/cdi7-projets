package fr.isika.cdi07.devoir;

public class Fournisseur extends People {
	private String adresse;

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Fournisseur(String nom, int age, String email, String adresse) {
		super(nom, age, email);
		this.adresse = adresse;
	}

	@Override
	public String adresser() {

		return this.getAdresse();
	}

	@Override
	public String toString() {
		return "Fournisseur [adresse=" + adresse + "]";
	}
}
