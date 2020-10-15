package exercice;

public class Ex2 {

	private static Integer calculateSum(Integer number) {
		Integer sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}

		return sum;

	}

	public static void main(String[] args) {
		System.out.println(calculateSum(9));
	}
}