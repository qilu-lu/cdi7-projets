package exercice;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
	
	public static Integer summe(List<Integer> number) {
		Integer total = 0;
		for (Integer a : number) {
			total = total + a;
		}
		return total;

	}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 7, 8, 9, 32);
		// calculer la somme des numbers dans une nouvelle methode
		 System.out.println(summe(numbers));
	}
}
