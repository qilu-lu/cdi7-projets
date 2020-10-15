package Touslesjours;

public class PrintWord {
	public static void main(String[] args) {
		char[][] words = { { 'a', 'n', 'i', 'm', 'a', 'l' },

				{ 'r', 'a', 'd', 'a', 'r' }, { 'r', 'e', 's', 'u', 'm', 'a' },
				{ 'r', 'e', 's', 's', 'a', 's', 's', 'e', 'r' }, { 'r', 'e', 'l', 'a', 'c', 'e', 'r' },
				{ 'k', 'a', 'y', 'a', 'k' }, { 'v', 'i', 'v', 'e', ' ', 'J', 'a', 'v', 'a', ' ', '!' } };

		// printWords(words);
		System.out.println(isPalindrome(words[3]));
		printPalindromes(words);
		reverseWord(words[4]);
	}

	public static void printWord(char[] word) {
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}

	}

	public static void printWords(char[][] words) {
		for (int i = 0; i < words.length; i++) {
			// for (int j = 0; j < words[i].length; j++) {
			// System.out.print(words[i][j]);

			printWord(words[i]);
		}

	}

	public static boolean isPalindrome(char[] word) {
		for (int i = 0; i < word.length / 2;i++) {
			if (word[i] != word[word.length - 1 - i]) {
				return false;
			}

		}
		return true;
	}

	public static void printPalindromes(char[][] words) {
		for (int i = 0; i < words.length; i++) {
			if (isPalindrome(words[i]) == true) {
				System.out.println(words[i]);
			}
		}
	}

	public static void reverseWord(char[] word) {

		for (int i = 0; i < (word.length) / 2; i++) {
			char mot = word[i];
			word[i] = mot;
			word[i] = word[word.length - 1 - i];
			word[word.length - 1 - i] = mot;
		}
		printWord(word);

	}

}
