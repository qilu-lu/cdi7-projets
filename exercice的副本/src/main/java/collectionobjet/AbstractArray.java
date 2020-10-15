package collectionobjet;

public class AbstractArray {
	protected int[] montableau = new int[10];
	protected Integer currentIndex = 0;

	public int Premier() {
		return montableau[0];
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = montableau[i] + sum;
		}
		return sum;
	}

	public void Affiche() {
		System.out.println(montableau);
	}

	public boolean IlEnReste() {
		return currentIndex < montableau.length - 1;
	}

	public int Suivant() {
		int entier = montableau[currentIndex + 1];
		currentIndex = currentIndex + 1;
		return entier;
	}
}
