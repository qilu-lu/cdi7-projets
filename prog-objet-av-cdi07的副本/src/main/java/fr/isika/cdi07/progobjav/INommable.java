package fr.isika.cdi07.progobjav;

import java.util.Date;

public interface INommable {
	static Date dateDuJour() {
		return new Date();
	}

	default String nommer() {
		return dateDuJour().toString();
	}
}
