package exercice;

public class Ex8 {
	private static Integer factorielle(Integer number) {
		Integer result = 1;

		for (int i = number; i > 0; i--) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorielle(5));
	}
	// calculer la factorielle dun nombre
	// factorielle de 5 = 5*4*3*2*1
	// creer une methode
}
