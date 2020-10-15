package shapes;

import java.util.ArrayList;
import java.util.List;

public class NumberTeam {
	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= (7 - i); j++) {
				System.out.print("\t");
			}
			List<Integer> el = new ArrayList<>();
			for (int k = 0; k < i + 1; k++) {
				int e = (int) Math.pow(2, k);
				System.out.print(e + "\t");
				el.add(e);
			}
			for (int w = el.size()-2; w >= 0; w--) {
				System.out.print(el.get(w) + "\t");
			}

			System.out.println();
		}

	}
}
