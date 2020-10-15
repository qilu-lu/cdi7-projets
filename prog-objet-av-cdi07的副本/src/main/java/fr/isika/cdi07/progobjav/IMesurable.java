package fr.isika.cdi07.progobjav;

public interface IMesurable {
	default float mesurer() {
		return 0;
	}
}
