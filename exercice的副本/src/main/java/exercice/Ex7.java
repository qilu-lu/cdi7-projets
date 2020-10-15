package exercice;

import java.util.Arrays;
import java.util.List;

public class Ex7 {
	public static Integer max(List<Integer> number) {
		Integer total =number.get(0);
		for (Integer a : number) {
			if (a > total) {
				total = a;
			}
		}
		return total;

	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(-1, -2, -6);
		// Afficher le plus grand nombre de la liste => creer une methode
		System.out.println(max(numbers));
	}
}
