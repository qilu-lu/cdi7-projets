package pers;

public class Personne {
	String name;
	public static String test;

	public Personne(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Personne [name=" + name + "]";
	}

}
