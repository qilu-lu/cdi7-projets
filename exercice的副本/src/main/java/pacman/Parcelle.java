package pacman;

import java.util.ArrayList;
import java.util.List;

public class Parcelle {
	private List<Obj> objets = new ArrayList<>();

	public List<Obj> getObjets() {
		return objets;
	}

	public String print() {
		if (objets.size() > 1) {
			for (Obj obj : objets) {
				if (obj instanceof Monster) {
					return "X";
				}
			}
		} else if (objets.size() == 1) {
			return objets.get(0).print();
		}
		return " ";
	}

	public <T> boolean containsObject(Class<T> class1) {
		return (getObject(class1) != null);
	}

	public <T> T getObject(Class<T> class1) {
		for (Obj obj : objets) {
			if (obj!=null && obj.getClass().isAssignableFrom(class1)) {
				return (T) obj;
			}
		}
		return null;
	}

	public boolean isEmpty() {
		return objets.isEmpty();
	}

	@Override
	public String toString() {
		return "Parcelle [objets=" + objets + "]";
	}

}
