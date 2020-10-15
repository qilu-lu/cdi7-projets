package menagerie;

public class Animal {
	private String nom;
	private String espece;
	private double poids;

	public Animal() {
		super();

	}

	public Animal(String nom, String espece, int poids) {
		super();
		this.nom = nom;
		this.espece = espece;
		this.poids = poids;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	@Override
	public String toString() {
		return nom + "[" + espece + "] (" + poids + "kg)";
	}
}
