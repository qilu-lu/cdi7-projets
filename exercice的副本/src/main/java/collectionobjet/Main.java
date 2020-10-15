package collectionobjet;

public class Main {
	public static void main(String[] args) {
		AbstractArray nb = new Entier();
		showAll(nb);
	}

	public static void showAll(AbstractArray nb) {
		System.out.println(nb.Premier());
		while (nb.IlEnReste()) {
			System.out.println(nb.Suivant());
		}
	}

}
