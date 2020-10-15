package fr.isika.cdi07.devoir;

public class Client extends People {

	private double ca;

	public Client(String nom, int age, String email, double ca) {
		super(nom, age, email);
		this.ca = ca;
	}

	public double getCa() {
		return ca;
	}

	public void setCa(double ca) {
		this.ca = ca;
	}

}
