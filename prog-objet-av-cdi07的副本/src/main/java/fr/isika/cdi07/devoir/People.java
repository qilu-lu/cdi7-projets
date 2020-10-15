package fr.isika.cdi07.devoir;

public class People implements IAdressable {
	private String nom;
	private int age;
	private String email;


	public People(String nom, int age, String email) {
		super();
		this.nom = nom;
		this.age = age;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String adresser() {

		return this.getEmail();
	}
}
