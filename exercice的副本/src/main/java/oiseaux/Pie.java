package oiseaux;

public class Pie extends Oiseaux{
	public Pie(String nom) {
		super(nom);
	}

	public void decrire() {
		System.out.println(this.getNom() + " je suis une pie");
	}

}



