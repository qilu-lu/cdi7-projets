package exercice;

public class TestEleve {
	
	public static void main(String[] args) {
		Eleve lu = new Eleve("Lu");
		lu.ajouterNote(18);
		lu.ajouterNote(20);
		
		System.out.println(lu);
		System.out.println(lu.getMoyenne());
	}
}