package aeroports;

import java.util.ArrayList;
import java.util.List;

public class Pays {

	List<Ville> ville = new ArrayList<>();
	String paysName;

	public Pays(String name) {
		this.paysName = name;
	}

	@Override
	public String toString() {
		return "Pays [ville=" + ville + ", paysName=" + paysName + "]";
	}

}