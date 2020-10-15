package exercice;

import java.util.ArrayList;
import java.util.List;

public class ex10 {

	public static List<Double> calculerRacine(int a, int b, int c) throws Exception {
		List<Double> solutions = new ArrayList<>();

		double delta = b * b - 4. * a * c;
		if (delta >= 0) {
			double x1 = (-b - Math.sqrt(delta)) / 2 * a;
			solutions.add(x1);
			if (delta > 0) {
				double x2 = (-b + Math.sqrt(delta)) / 2 * a;
				solutions.add(x2);
			}
			return solutions;
		}
		throw new Exception("No solution");

	}

	public static void main(String[] args)  {
		int a = 2;
		int b = 3;
		int c = 5;
		List<Double> racines;
		try {
			
			racines = calculerRacine(a, b, c);
			System.out.println(racines);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Ecrire une méthode qui résoud une équation du second degré
		// La méthode doit renvoyer une liste avec les solutions
		// Equation du second degré du type a*x^2+b*x+c=0
		// Par exemple : 2x^2+3x+5=0
		// dans ce cas, a=2, b=3, c=5
		// La méthode prendra les 3 parametres, a, b, c
		// Etape 1, calculer le delta : delta = b^2-4*a*c
		// Etape 2 : calculer les solutions

		// Si delta > 0 alors
		// Solution 1 = (-b - racine(delta)) /( 2*a)
		// Solution 2 = (-b + racine(delta)) /( 2*a)

		// Si delta = 0 alors
		// Solution 1 = (-b ) /( 2*a)

		// Si delta <0 alors
		// Aucune solutoin

	}
}
