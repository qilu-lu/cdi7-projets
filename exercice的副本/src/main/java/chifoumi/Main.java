package chifoumi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Boolean joue = true;

		while (joue == true) {
			joue=jouer(input);

		}

		// Choix choix1 = Choix.CISEAUX;
		// pierre > ciseau
		// ciseau > papier
		// pierre < papier

	}

	private static Boolean jouer(Scanner input) {
		System.out.println("joueur 1 :");
		String j1 = input.nextLine();
		System.out.println("joueur 2 :");
		String j2 = input.nextLine();

		Choix choix1 = toChoix(j1);
		Choix choix2 = toChoix(j2);

		if (choix1 == Choix.CISEAUX && choix2 == Choix.PAPIER) {
			System.out.println("joueur 1 gagne");
		}
		if (choix1 == Choix.CISEAUX && choix2 == Choix.PIERRE) {
			System.out.println("joueur 2 gagne");
		}
		if (choix1 == Choix.PIERRE && choix2 == Choix.CISEAUX) {
			System.out.println("joueur 1 gagne");
		}
		if (choix1 == Choix.PIERRE && choix2 == Choix.PAPIER) {
			System.out.println("joueur 2 gagne");
		}
		if (choix1 == Choix.PAPIER && choix2 == Choix.PIERRE) {
			System.out.println("joueur 1 gagne");
		}
		if (choix1 == Choix.PAPIER && choix2 == Choix.CISEAUX) {
			System.out.println("joueur 2 gagne");
		}
		if (choix1 == choix2) {
			System.out.println("egalite");
			System.out.println("rejouer ?");
			String r = input.nextLine();
			if (r.equals("oui")) {
				return true;
			}

		}
		
		return false;
	}

	private static Choix toChoix(String j1) {
		Choix choix1 = null;
		if (j1.equals("papier")) {
			choix1 = Choix.PAPIER;
		} else if (j1.equals("pierre")) {
			choix1 = Choix.PIERRE;
		} else if (j1.equals("ciseaux")) {
			choix1 = Choix.CISEAUX;
		}
		return choix1;
	}

}
