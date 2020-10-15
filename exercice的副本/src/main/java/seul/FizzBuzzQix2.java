package seul;

public class FizzBuzzQix2 {
	public static String changerChiffre(int a) {
		String s = "";
		if (isDivisibleBy(a, 3)) {
			s = s + "Fizz";
		}
		if (isDivisibleBy(a, 5)) {
			s = s + "Buzz";
		}
		if (isDivisibleBy(a, 7)) {
			s = s + "Qix";
		}

		for (int i = 0; i < String.valueOf(a).split("").length; i++) {
			String c = String.valueOf(a).split("")[i];
			if (containsChiffre(c, 3)) {
				s = s + "Fizz";
			}
			if (containsChiffre(c, 5)) {
				s = s + "Buzz";
			}
			if (containsChiffre(c, 7)) {
				s = s + "Qix";
			}
			if (containsChiffre(c, 0)) {
				s = s + "*";
			}
		}
		if (s.isEmpty()) {
			s = String.valueOf(a);
		}
		if (s.replace("*", "").isEmpty()) {
			s = String.valueOf(a).replace("0", "*");
		}

		return s;

	}

	private static boolean containsChiffre(String a, int b) {
		return a.contains(String.valueOf(b));
	}

	private static boolean isDivisibleBy(int a, int divider) {
		return a % divider == 0;
	}

}
