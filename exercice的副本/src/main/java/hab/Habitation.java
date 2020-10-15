package hab;

public class Habitation {
	private String proprietaire;
	private String adress;
	private double surface;

	public Habitation(String proprietaire, String a, double s) {
		this.proprietaire = proprietaire;
		adress = a;
		this.surface = s;
	}

	public double impot() {
		double impot = surface * 2;
		return impot;
	}

	@Override
	public String toString() {
		return "HabitationtoString [proprietaire=" + proprietaire + ", adress=" + adress + ", surface=" + surface + "]";
	}

	public Habitation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void affiche() {
		System.out.println(
				"Habitation [proprietaire=" + proprietaire + ", adress=" + adress + ", surface=" + surface + "]");
	}

	

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

}
