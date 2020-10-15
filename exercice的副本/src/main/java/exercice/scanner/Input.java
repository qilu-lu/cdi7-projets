package exercice.scanner;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("marque");
		String brand = input.nextLine();
		System.out.println(brand);
	}

}
