package collectionobjet;

public class MainCasier {
	public static void main(String[] args) {

		Casier k = new Casier();

		for (int i = 0; i < 10; i++) {
			Integer a = (int) (Math.random() * 90 + 10);
			k.Range(a, i);
		}

		System.out.println(k.Premier());
		while (k.IlEnReste()) {
			System.out.println(k.Suivant());
		}
		System.out.println(k.sum());
	}
}