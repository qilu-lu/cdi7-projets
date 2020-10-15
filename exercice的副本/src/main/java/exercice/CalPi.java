package exercice;

public class CalPi {
	double r = 1;

	public static double point(double a, double b) {
		if (a * a + b * b <= 1) {
			// on the rond;
			return 3;
		}
		return 4;
	}

	public static void main(String[] args) {
		int count = 0;
		long nombre = 100000000l;
		for (long i = 0; i < nombre; i++) {
			double a = Math.random();
			double b = Math.random();

			if (point(a, b) == 3) {
				count++;
			}

		}
		System.out.println(count);
		double pi = 4. * count / nombre;
		System.out.println(pi);
	}

}
