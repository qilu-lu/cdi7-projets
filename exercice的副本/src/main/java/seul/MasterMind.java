package seul;

import java.util.Scanner;

public class MasterMind {
	public static void main(String[] args) {
		String[] secret = { "blue", "red", "green", "pink" };
		String[] ret = evaluate(secret, input());

		for (String string : ret) {
			System.out.print(string);

		}
	}

	public static String[] input() {
		String[] guess = new String[4];
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("choice your 1st color");
			guess[0] = input.next();
			System.out.println("choice your 2nd color");
			guess[1] = input.next();
			System.out.println("choice your 3rd color");
			guess[2] = input.next();
			System.out.println("choice your 4th color");
			guess[3] = input.next();
		}
		return guess;
	}

	public static String[] evaluate(String[] secret, String[] guess) {

		int place = 0;
		int color = 0;
		String str[] = new String[2];
		for (int i = 0; i < guess.length; i++) {

			if (guess[i].equals(secret[i])) {
				place++;
			}
			if (containof(guess[i], secret)) {
				color++;
			}
		}
		str[0] = String.valueOf(place);
		str[1] = String.valueOf(color);

		return str;

	}

	public static boolean containof(String str, String[] s) {
		int c = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].contains(str)) {
				c++;
			}
			if (c > 0) {
				return true;
			}
		}
		return false;

	}

}
