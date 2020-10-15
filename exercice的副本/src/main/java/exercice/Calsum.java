package exercice;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Calsum {
	public static void main(String[] args) {

		try (Scanner scanne = new Scanner(System.in)) {
			System.out.print("give a number");
			Integer number11 = scanne.nextInt();
			
			Integer sommet1 = 0;
			while (number11  > 0) {

				sommet1 = sommet1 + number11 % 10;
				number11 = number11 / 10;
			}
				System.out.println(sommet1);

			
		}
	}
}