package pile;

public class pile3 {
	private int[] liste = new int[10];
	Integer i = 0;

	void empiler(int n) {
		liste[i] = n;
		i = i + 1;
	}

	public int depiler() throws Exception {
		if (estVide()) {
			throw new Exception();
		} else {
			i = i - 1;
			return liste[i];
		}
	}

	public boolean estVide() {
		return i == 0;
	}

public boolean check() 
{
	boolean x=false;
	if (i > 0 && j > 0 && k > 0) {
		x=true;
	}
	else {
		throw new IllegalArgumentException();
		x=false;
	}
	return x;
}
}