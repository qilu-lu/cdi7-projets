package setarry;

import org.junit.Assert;
import org.junit.Test;

import arrayset.ArraySet;

public class TestArraySet {
	@Test
	public void should_afficher_size() {
		ArraySet setarry = new ArraySet();
		setarry.add(1);

		int taille = setarry.getNb();
		Assert.assertEquals(taille, 1);
	}

	@Test
	public void should_afficher_size_plus() {
		ArraySet setarry = new ArraySet();
		setarry.add(1);
		setarry.add(2);
		setarry.add(3);
 		setarry.add(4);
		setarry.add(5);
		setarry.add(6);

		int taille = setarry.getNb();
		Assert.assertEquals(6, taille);
	}
	@Test
	public void should_afficher_size_doublant() {
		ArraySet setarry = new ArraySet();
		setarry.add(1);
		setarry.add(2);
		setarry.add(2);
		setarry.add(3);
		setarry.add(4);
		int taille = setarry.getNb();
		Assert.assertEquals(4, taille);
	}
	@Test
	public void should_afficher_size_doublantlong() {
		ArraySet setarry = new ArraySet();
		setarry.add(5);
		setarry.add(6);
		setarry.add(5);
		setarry.add(8);
		setarry.add(9);
		//arraySet.add(10);
		setarry.add(10);
		int taille = setarry.getNb();
		Assert.assertEquals(5, taille);
	}
}
