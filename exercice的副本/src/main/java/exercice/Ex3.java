package exercice;

import java.util.Arrays;
import java.util.List;

public class Ex3 {


	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 7, 8, 9, 32);
		
		Integer total = 0;
		for (Integer a : numbers) {
			total = total + a;
		}
		
		System.out.println(total);
	}
}
