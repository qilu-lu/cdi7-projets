package fr.isika.cdi7.fizzbuzz;

/**
 * Générateur de suite fizz buzz
 */
public class FizzBuzzGenerator {

	// Ici il vaut mieux penser à utiliser les constantes Java pour les valeurs fixes d'un programme
	// Comme pour les diviseurs dans notre cas
	private static final int DIVISEUR_TROIS = 3;
	private static final int DIVISEUR_CINQ = 5;
	private static final int DIVISEUR_QUINZE = DIVISEUR_TROIS * DIVISEUR_CINQ;

	public String genererSuiteFizzBuzz(int debutSuite, int finSuite) {
		
		// On utiliser un StringBuilder pour concaténer les chaînes de caractères
		// C'est plus optimlisé et c'est une bonne pratique
		
		StringBuilder sequenceBuilder = new StringBuilder();
		
		for (int etapeSuite = debutSuite; etapeSuite <= finSuite; etapeSuite++) {
			
			String resultatRemplacement = remplaceSelonFizzBuzz(etapeSuite);
			
			// Pour ajouter une valeur au builder (concaténer implicitement une nouvelle valeur)
			
			// On appelle la méthode : append(...)
			// Il y'a une méthode différente pour chaque type de valeur (int, float, boolean ...)
			
			sequenceBuilder.append(resultatRemplacement);
		}
		
		// Pour récupérer le contenu du builder, 
		// on appelle le .toString() sur l'objet de type StringBuilder
		return sequenceBuilder.toString();
	}

	private String remplaceSelonFizzBuzz(int valeur) {
		if (estMultiple(valeur, DIVISEUR_QUINZE)) {
			return "FizzBuzz";
		} else if (estMultiple(valeur, DIVISEUR_CINQ)) {
			return "Buzz";
		} else if (estMultiple(valeur, DIVISEUR_TROIS)) {
			return "Fizz";
		}
		return String.valueOf(valeur);
	}

	private boolean estMultiple(int nombre, int diviseur) {
		/* 
		 * L'opérateur ternaire
		 * 		resultat = (condition) ? valeur en cas de condition vraie : valeur en cas de condition fausse
		 * 
		 * le "?" représente le "alors" dans un if classique
		 * le ":" représente le "sinon" dans un if classique
		 */

		// ça donne donc
		// 	if (reste de la division de nombreDivisible par le diviseur est égal à 0)
		// 		ALORS renvoi true
		// 		SINON renvoi false
		
		// C'est comme si j'écrivais 
		// if(nombre % diviseur == 0) {
		// 	return true;
		// } else {
		// 	return false;
		// }

		return nombre % diviseur == 0 ? true : false;
	}
}
