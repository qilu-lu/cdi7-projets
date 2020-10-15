package exercice.scanner;

import java.util.Scanner;

public class shopping {
	private static double total() {
		Double total = 0.;
		Scanner input = new Scanner(System.in);
		System.out.print("combien lv: ");
		int nbLv = input.nextInt();
		System.out.print("combien hermes: ");
		int nbHermes = input.nextInt();
		System.out.print("combien chanel: ");
		int nbChanel = input.nextInt();
		total = nbLv * 35000 + nbHermes * 11044.5 + nbChanel * 1535;
		return total;
	}

	public static void main(String[] args) {
		System.out.println(total());
	}
}
