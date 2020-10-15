package msort;

public class MergeSort {
	public static void main(String[] args) {

		int[] t1 = { 3, 4, 7 };
		int[] t2 = { 1, 2, 5, 9 };
//display(t1);
		// display(merge(1, t1));
		display(merge(t1, t2));
	}

	public static void display(int[] t) {
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i]);
		}
//?不能直接打印tableau？
		// System.out.println(t.toString());
	}

	public static int[] right(int[] tab) {
		int[] nt = new int[tab.length - 1];
		for (int i = 1; i < tab.length; i++) {
			nt[i - 1] = tab[i];
		}
		return nt;
	}

	public static int[] merge(int val, int[] tab) {
		int[] nt2 = new int[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			nt2[0] = val;
			nt2[i + 1] = tab[i];
		}
		return nt2;

	}

	public static int[] merge(int[] tab1, int[] tab2) {
		if (tab1.length == 0) {
			return tab2;
		}
		if (tab2.length == 0) {
			return tab1;
		}
		int[] nt3 = new int[tab1.length + tab2.length];
		if (tab2[0] >= tab1[0]) {
			// for (int i = 1; i < tab1.length; i++) {

			int[] droite = right(tab1);
			int[] gauche = merge(tab2[0], droite);
			return gauche;
			// }
		} else {
			// for (int i = 1; i <= tab2.length; i++) {
			// int[] nb4 = right(tab2);
			// int[] nbf = merge(tab2[0], nb4);
			// return nbf;
			return merge(tab2, tab1);
			// }
		}
		// return null;

	}
}