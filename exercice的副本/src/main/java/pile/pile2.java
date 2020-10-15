package pile;

import java.util.LinkedList;
import java.util.List;

public class pile2 {
	List<Integer> liste = new LinkedList<>();

	void empiler(int n) {
		liste.add(n);
	}

	public int depiler() throws Exception {
		if (liste.isEmpty()) {
			throw new Exception();
		} else {
			Integer ret = liste.get(liste.size() - 1);
			liste.remove(liste.size() - 1);
			return ret;
		}
	}

	public boolean estVide() {
		return liste.isEmpty();
	}
}
