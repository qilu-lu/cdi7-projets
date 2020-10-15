package oiseaux;

public class Merle extends Oiseaux {
	public Merle(String nom) {
		super(nom);
	}

	public void decrire() {
		System.out.println(this.getNom() + " je suis un merle");
	}

}
