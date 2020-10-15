package exercice.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		List<Integer> nombres = new ArrayList<>();
		Scanner scanne = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("input un nombre");
			Integer varidufghdfgihu = scanne.nextInt();
			nombres.add(varidufghdfgihu);
		}
		System.out.println(nombres);
	}
}
