package monnais;

import org.junit.Test;
import static monnais.ListUtil.optimalChange;
import junit.framework.Assert;

public class Test1 {

	@Test
	public void test1() {
		long s = 9223372036854775807L; // Change this value to perform other tests
		Change m = optimalChange(s);
		Assert.assertEquals(m.bill10, 922337203685477580l);
		Assert.assertEquals(m.bill5, 1);
		Assert.assertEquals(m.coin2, 1);
	}

	@Test
	public void test2() {
		long s = 10; // Change this value to perform other tests
		Change m = optimalChange(s);
		Assert.assertEquals(m.bill10, 1);
		Assert.assertEquals(m.bill5, 0);
		Assert.assertEquals(m.coin2, 0);
	}

	@Test
	public void test3() {
		long s = 1; // Change this value to perform other tests
		Change m = optimalChange(s);
		Assert.assertEquals(m.bill10, 0);
		Assert.assertEquals(m.bill5, 0);
		Assert.assertEquals(m.coin2, 0);
	}

	@Test
	public void test4() {
		long s = 6; // Change this value to perform other tests
		Change m = optimalChange(s);
		Assert.assertEquals(m.bill10, 0);
		Assert.assertEquals(m.bill5, 0);
		Assert.assertEquals(m.coin2, 3);
	}

	public static void main(String[] args) {
		long s = 9223372036854775807L; // Change this value to perform other tests
		Change m = optimalChange(s);

		System.out.println("Coin(s)  2€: " + m.coin2);
		System.out.println("Bill(s)  5€: " + m.bill5);
		System.out.println("Bill(s) 10€: " + m.bill10);

		long result = m.coin2 * 2 + m.bill5 * 5 + m.bill10 * 10;
		System.out.println("\nChange given = " + result);
	}
}