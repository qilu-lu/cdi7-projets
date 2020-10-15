package collectionobjet;

public class Impair extends AbstractArray {

	public Impair() {
		for (int i = 0; i < montableau.length; i++) {
			montableau[i] = i * 2 + 1;
		}
	}

}
