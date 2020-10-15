package aeroports;

import java.util.ArrayList;
import java.util.List;

public class Ville {

	List<Aeroport> aeroport = new ArrayList<>();
	
	String villeName;

	public Ville(String name) {
		this.villeName = name;
	}

	@Override
	public String toString() {
		return "Ville [aeroport=" + aeroport + ", villeName=" + villeName + "]";
	}
}
