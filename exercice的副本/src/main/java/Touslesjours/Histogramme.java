package Touslesjours;

public class Histogramme {
	public static void main(String[] args) {
		int[] tab = { -1, -3, 2, -2, 3, 0, 4, 2, -2, -1 };
		histogramme(tab);
		histogramme2(tab);
	}

	public static String histogramme(int[] tableau) {
		Integer max = maxi(tableau).getMax();
		// Integer min = maxi(tableau).getMin();
//?static methodefor (int j = 0; j < max; j++)
		for (int j = 0; j < max; j++) {
			System.out.println();
			for (int i = 0; i < tableau.length; i++) {

				if (tableau[i] != 0) {

					if (tableau[i] > 0) {
						if (max - tableau[i] - j > 0) {
							System.out.print(" ");
						}
						if (max - tableau[i] - j <= 0) {

							System.out.print("*");
						}

					}
					if (tableau[i] < 0) {
						System.out.print(" ");
					}
					/*
					 * if (tableau[i] < 0) { if (Math.abs(tableau[i]) - j > 0) {
					 * System.out.print("*"); }
					 * 
					 * }
					 */
				} else {
					System.out.print(" ");
				}

			}
		}
		System.out.println();

		for (int i = 1; i < tableau.length; i++) {
			System.out.print("+");
			if (tableau[i] == 0) {
				System.out.print("*");
			}
		}
		System.out.println();
		return null;
	}

	public static String histogramme2(int[] tableau) {
		Integer min = maxi(tableau).getMin();
		for (int k = 0; k < Math.abs(min); k++) {
			if (k > 0) {
				System.out.println();
			}
			for (int k2 = 0; k2 < tableau.length; k2++) {
				if (tableau[k2] != 0) {
					if (tableau[k2] < 0) {
						if (Math.abs(tableau[k2]) - k > 0) {

							System.out.print("*");
						}
						if (Math.abs(tableau[k2]) - k <= 0) {

							System.out.print(" ");
						}
					}
					if (tableau[k2] > 0) {
						System.out.print(" ");
					}
				} else {
					System.out.print(" ");
				}
			}
		}
		return null;

	}

	/*
	 * if(tableau[i] < 0) { if (Math.abs(tableau[i]) - j > 0) {
	 * System.out.print("*"); } else { System.out.print(" "); }
	 */

	public static Deux maxi(int[] tableau) {
		Deux deux = new Deux();
		int max = 0;
		int min = 0;
		for (int i = 0; i < tableau.length; i++) {

			if (tableau[i] > max) {
				max = tableau[i];
			}

			if (tableau[i] < 0) {
				if (Math.abs(tableau[i]) > Math.abs(min)) {
					min = tableau[i];

				}
			}
		}
		deux.setMax(max);
		deux.setMin(min);

		return deux;

	}
}
