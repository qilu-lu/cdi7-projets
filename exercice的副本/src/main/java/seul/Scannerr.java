package seul;

import java.util.Scanner;

public class Scannerr {
	public static void main(String[] args) {
		try (Scanner scanne = new Scanner(System.in)) {
			System.out.print("give a r");
			Double radius = scanne.nextDouble();

			Double surface = radius * radius * 3.1415;
			System.out.println("圆的面积为" + surface);
		}
	}
}