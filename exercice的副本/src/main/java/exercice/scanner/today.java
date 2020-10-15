package exercice.scanner;

import java.util.Scanner;

public class today {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入圆半径");
		double radius = input.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.println("圆面积" + area);

	}
}