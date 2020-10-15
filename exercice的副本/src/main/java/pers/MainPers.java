package pers;

public class MainPers {
	public static void main(String[] args) {
		Personne brice = new Personne("Brice");
		Personne.test = "bb";
		Personne lu = new Personne("Lu");
		Personne.test = "aa";

		System.out.println(brice);
		System.out.println(lu);

		System.out.println(brice.test);
		System.out.println(lu.test);

	}
}
