package exercice;

import java.util.ArrayList;
import java.util.List;

public class DeuxFor {

	public static List<Integer> generateNb(int n) {
		List<Integer> ret = new ArrayList<Integer>();
		if (n >= 0) {
			ret.add(1);
		}
		if (n >= 1) {
			ret.add(2);
		}
		for (int w = 2; w <= n; w++) {
			ret.add(ret.get(w-1)+ret.get(w-2));
		}
		return ret;
	}

	public static void main(String[] args) {
		int nbligne = 5;
		for (int i = 0; i < nbligne; i++) {
			for (int j = 0; j < nbligne - i; j++) {
				System.out.print(" ");
			}
			List<Integer> el = generateNb(i);
			for (int j = 0; j < el.size(); j++) {
				System.out.print(el.get(j));
			}
			for (int j = el.size() - 2; j >= 0; j--) {
				System.out.print(el.get(j));
			}

			System.out.println();
		}

	}

}
