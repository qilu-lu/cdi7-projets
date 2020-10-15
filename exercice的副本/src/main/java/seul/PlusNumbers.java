package seul;

import java.util.Scanner;

public class PlusNumbers {
	public static void main(String[] args) {
		Integer total = 0;
		try (Scanner ss = new Scanner(System.in)) {
			System.out.println("give a number");
			Integer num = ss.nextInt();
			for (int i = num; i > 0; i--) {
				total = total + i;
			}
		}
		System.out.println("total is " + total);
	}
}
