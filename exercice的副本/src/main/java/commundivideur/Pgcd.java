package commundivideur;

public class Pgcd {
	public static void main(String[] args) {
		if (args.length != 2) {
			return;
		}

		Integer p = Integer.parseInt(args[0]);
		Integer q = Integer.parseInt(args[1]);
		System.out.println(pgcd(p, q));

	}

	public static int pgcd(int p, int q) {
		int max = 1;
		if (p == 0) {
			return q;
		}
		if (q == 0) {
			return p;
		}
		if (p > q) {
			p = p - q;
			max = maxi(p, q, max);
			return max;
		}
		if (p < q) {
			q = q - p;
			max = maxi(p, q, max);
			return max;
		}
		return 0;
	}

	private static int maxi(int p, int q, int max) {
		for (int i = 1; i < q; i++) {
			if (p % i == 0 && q % i == 0) {
				max = i;
			}
		}
		return max;
	}
}