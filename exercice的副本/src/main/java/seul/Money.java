package seul;

public class Money {
	public static void main(String[] args) {
		System.out.println(choix("10000003009.00$"));
		// System.out.println(numberToWordsm("2011.00$"));

	}

	public static String numberToWords5(String s) {
		String preNum = getWords(Character.toString((s.charAt(0))));
		
		String Numf = "";

		Numf = preNum;

		return Numf;
	}

	public static String numberToWords6(String s) {

		String num = "";
		String numf = "";

		for (int i = 0; i < 2; i++) {
			num = num + s.charAt(i);
		}

		int mM = Integer.parseInt(num) / 1000000;
		int cm = (Integer.parseInt(num) - mM * 1000000) / 100000;
		int dm = (Integer.parseInt(num) - mM * 1000000 - cm * 100000) / 10000;
		int m = (Integer.parseInt(num) - mM * 1000000 - cm * 100000 - dm * 10000) / 1000;
		int c = (Integer.parseInt(num) - mM * 1000000 - cm * 100000 - dm * 10000 - m * 1000) / 100;
		int d = (Integer.parseInt(num) - mM * 1000000 - cm * 100000 - dm * 10000 - m * 1000 - c * 100) / 10;
		int u = (Integer.parseInt(num) - mM * 1000000 - cm * 100000 - dm * 10000 - m * 1000 - c * 100 - d * 10);

		if (u != 0 && d != 1) {
			numf = getWords(String.valueOf(d * 10)) + getWords(String.valueOf(u));
		}
		if (u != 0 && d == 1) {
			numf = getWords(String.valueOf(num));
		}

		if (d == 0) {
			numf = "and" + getWords(String.valueOf(u));
		}

		else if (u == 0) {
			numf = getWords(String.valueOf(d * 10));

		}
		return numf;
	}

	public static String numberToWords7(String s) {
		int w = s.length();
		String num = "";
		String numf = "";
		String ss = "";
		for (int i = 0; i < 3; i++) {
			num = num + s.charAt(i);

		}
		for (int j = 1; j < w; j++) {
			ss = ss + s.charAt(j);
		}
		int mM = Integer.parseInt(num) / 1000000;
		int cm = (Integer.parseInt(num) - mM * 1000000) / 100000;
		int dm = (Integer.parseInt(num) - mM * 1000000 - cm * 100000) / 10000;
		int m = (Integer.parseInt(num) - mM * 1000000 - cm * 100000 - dm * 10000) / 1000;
		int c = (Integer.parseInt(num) - mM * 1000000 - cm * 100000 - dm * 10000 - m * 1000) / 100;
		int d = (Integer.parseInt(num) - mM * 1000000 - cm * 100000 - dm * 10000 - m * 1000 - c * 100) / 10;
		int u = (Integer.parseInt(num) - mM * 1000000 - cm * 100000 - dm * 10000 - m * 1000 - c * 100 - d * 10);
		// if (w == 7) {

		if (d != 0 && c != 0) {
			numf = getWords(String.valueOf(c)) + " hundred " + numberToWords6(ss);
			// + getWords(String.valueOf(d * 10))
			// + getWords(String.valueOf(u));
		} // 100 000 000
		if (d == 0 && c != 0) {
			if (u != 0) {
				numf = getWords(String.valueOf(c)) + " hundred and " + getWords(String.valueOf(u));
			}
			if (u == 0) {
				numf = getWords(String.valueOf(c)) + " hundred ";
			}
		}

		if (num.charAt(1) != 0 && num.charAt(2) == 0) {
			numf = getWords(String.valueOf(c)) + " hundred " + getWords(String.valueOf(d * 10));
		}
		if (c == 0 && d == 0 && u != 0) {
			numf = "and " + getWords(String.valueOf(u));
		}
		if (c == 0 && d != 0) {
			numf = "and " + numberToWords6(d * 10 + u + ".00$");
		}
		return numf;
	}

	public static String numberToWordsm(String s) {
		int w = s.length();
		String Num = "";
		String Numf = "";
		String ss = "";
		String sss = "";

		for (int i = 0; i < w - 4; i++) {
			Num = Num + s.charAt(i);
		}
		for (int j = w - 7; j < w - (w - 7); j++) {
			ss = ss + s.charAt(j);
		}
		for (int i = 0; i < w - 7; i++) {
			sss = sss + s.charAt(i);
		}
		if (!sss.equals(0)) {
			if (w == 8) {
				Numf = numberToWords5(sss) + " thousand " + numberToWords7(ss);
			}
//100 000 000.00$
			if (w == 9) {
				Numf = numberToWords6(sss) + " thousand " + numberToWords7(ss);

			}
			if (w == 10) {
				Numf = numberToWords7(sss) + " thousand " + numberToWords7(ss);
			}
		}
		if (isZero(sss)) {

			Numf = numberToWords7(ss);
		}
		return Numf;

	}

	public static String numberToWordsmillion(String s) {
		int w = s.length();
		String Num = "";
		String Numf = "";
		String ss = "";
		String sss = "";
		for (int i = 0; i < w - 4; i++) {
			Num = Num + s.charAt(i);
		}
		for (int j = w - 10; j < w; j++) {
			//
			ss = ss + s.charAt(j);
		}
		for (int i = 0; i < w - 10; i++) {
			sss = sss + s.charAt(i);
		}
		sss = sss + ".00$";

		if (w == 11) {
			// 8 890 890.00$
			if (!isZero(ss)) {
				Numf = numberToWords5(sss) + " million " + numberToWordsm(ss);
				// Numf=numberToWordsm(ss);
			}
			if (isZero(ss)) {
				Numf = numberToWords5(sss) + " million ";
			}
		} // 10 000 003 009.00$
		if (w == 12) {
			// 11 996 968.00$
			if (!isZero(ss)) {
				Numf = numberToWords6(sss) + " million " + numberToWordsm(ss);
			}
			if (isZero(ss)) {
				Numf = numberToWords6(sss) + " million ";
			}
		}
		if (w == 13) {
			// 111 996 968.00$
			if (!isZero(ss)) {
				Numf = numberToWords7(sss) + " million " + numberToWordsm(ss);
			}
			if (isZero(ss)) {
				Numf = numberToWords7(sss) + " million ";
			}
		}
		if (isZero(sss)) {

			Numf = numberToWordsm(ss);
		}

		return Numf;

	}

	public static String numberToWordsb(String s) {
		int w = s.length();
		String num = "";
		String numf = "";
		String ss = "";
		String sss = "";
		for (int i = 0; i < w - 4; i++) {
			num = num + s.charAt(i);
		}
		for (int j = w - 13; j < w; j++) {

			ss = ss + s.charAt(j);
		}
		for (int i = 0; i < w - 13; i++) {
			sss = sss + s.charAt(i);
		}
		if (w == 14) {
			if (!isZero(ss)) {
				// 1 000 000 000.00$
				numf = numberToWords5(sss) + " billion" + numberToWordsmillion(ss);
			}
			if (isZero(ss)) {
				numf = numberToWords5(sss) + " billion";
			}
		} // 10 000 003 009.00$
		if (w == 15) {
			if (!isZero(ss)) {

				numf = numberToWords6(sss) + " billion" + numberToWordsmillion(ss);
			}
			if (isZero(ss)) {
				numf = numberToWords6(sss) + " billion";
			}
		}
		if (w == 16) {

			if (!isZero(ss)) {
				numf = numberToWords7(sss) + " billion" + numberToWordsmillion(ss);
			}
			if (isZero(ss)) {
				numf = numberToWords7(sss) + " billion";
			}

		}
		return numf;

	}

	public static String choix(String s) {
		String n = "";
		if (s.length() == 5) {
			n = numberToWords5(s) + " dollars";
		}
		if (s.length() == 6) {
			n = numberToWords6(s) + " dollars";
		}
		if (s.length() == 7) {
			n = numberToWords7(s) + " dollars";
		}
		if (s.length() >= 8 && s.length() <= 10) {
			n = numberToWordsm(s) + " dollars";
		}
		if (s.length() >= 11 && s.length() <= 13) {
			n = numberToWordsmillion(s) + "dollars";
		}
		if (s.length() >= 14 && s.length() <= 16) {
			n = numberToWordsb(s) + " dollars";
		}
		if (s.length() > 16) {
			n = "wrong";
		}
		return n;

	}

	private static boolean isZero(String ss) {
		return Math.abs(Double.parseDouble(ss.replace("$", ""))) < 0.001;
	}

	private static String getWords(String num) {
		switch (num) {
		case "1":
			return "one";
		case "2":
			return "two";
		case "3":
			return "three";
		case "4":
			return "four";
		case "5":
			return "five";
		case "6":
			return "six";
		case "7":
			return "seven";
		case "8":
			return "eight";
		case "9":
			return "nine";
		case "10":
			return "ten";
		case "11":
			return "eleven";
		case "12":
			return "nine";
		case "13":
			return "thirteen";
		case "14":
			return "fourteen";
		case "15":
			return "fifteen";
		case "16":
			return "sixteen";
		case "17":
			return "seventeen";
		case "18":
			return "eightteen";

		case "19":
			return "nightteen";
		case "20":
			return "twinty";
		case "30":
			return "thirty";

		case "40":
			return "fourty";
		case "50":
			return "fifty";
		case "60":
			return "sixty";
		case "70":
			return "seventy";
		case "80":
			return "eighty";
		case "90":
			return "ninety";

		default: {

			return null;
		}
		}
	}

}