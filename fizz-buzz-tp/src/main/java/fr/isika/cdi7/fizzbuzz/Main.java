package fr.isika.cdi7.fizzbuzz;

public class Main {

	private static final FizzBuzzGenerator generator = new FizzBuzzGenerator();

	public static void main(String[] args) {

		int start = 1;
		int end = 15;
		
		StringBuilder builder = new StringBuilder();
		System.out.println("******************************************************");
		System.out.println("Programme : Suite FizzBuzz");
		System.out.println("******************************************************");
		builder.append("La suite FizzBuzz pour la séquence de ");
		builder.append(start);
		builder.append(" à ");
		builder.append(end);
		builder.append(" est : ");
		System.out.println(builder.toString());
		
		String generated = generator.genererSuiteFizzBuzz(start, end);
		System.out.println(generated);
		
		System.out.println();
		System.out.println("******************************************************");
		System.out.println("Programme : exemple avec un if classique et l'opérateur ternaire");
		System.out.println("******************************************************");
		String chaine = "";

		System.out.println("If classique : ");
		System.out.println();
		System.out.println("if(pair % 2 == 0) { chaine = \"MaCondition était vraie\"; } else { chaine = \"MaCondition était fausse\";}");
		int pair = 8;
		if(pair % 2 == 0) {
			chaine = "MaCondition était vraie";
		} else {
			chaine = "MaCondition était fausse";
		}
		System.out.println("variable chaine = " + chaine);
		
		// Opérateur ternaire  Résultat = (condition) ? instruction en cas de condition vraie : instruction en cas de condition fausse 
		System.out.println();
		System.out.println("Opérateur ternaire : ");
		int impair = 9;
		chaine = (impair % 2 == 0) ? "MaCondition était vraie" : "MaCondition était fausse";
		System.out.println("chaine = (impair % 2 == 0) ? \"MaCondition était vraie\" : \"MaCondition était fausse\"");
		System.out.println("variable chaine = " + chaine);
	}

}
