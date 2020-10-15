package exercice.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import seul.SuprimerChiffre;



public class TestSuprimerChiffre {
	@Test
	public void shouldsupprimerchiffre() {
		List<String> liste = new ArrayList<>();
		liste.add("f");
		liste.add("g");
		liste.add("h");
		liste.add("i");
		liste.add("j");
	SuprimerChiffre.supprimer(liste);
	
	List<String>expected = new ArrayList<>();
	expected.add("g");
	expected.add("i");
	
	Assert.assertEquals(liste, expected);
}
}
