package exercice;

public class testgroupeleves {
	public static void main(String[] args) {
		Groupeleves groupe1=new Groupeleves();
		Eleve brice=new Eleve("brice");
		Eleve gugu=new Eleve("gugu");
		Eleve lulu=new Eleve("lulu");
	
		groupe1.ajouterEleve(brice);
		
		groupe1.ajouterEleve(gugu);
		groupe1.ajouterEleve(lulu);
		System.out.println(groupe1.chercher("lulu"));
		groupe1.lister();
		System.out.println(groupe1.nombre());
	
	}
}
