package seul;

import org.junit.Assert;
import org.junit.Test;

public class RomeNumber {

	/*
	 * @Test public void test1() { Assert.assertEquals("I", ToRome(1)); }
	 * 
	 * @Test public void test5() { Assert.assertEquals("V", ToRome(5)); }
	 * 
	 * @Test public void test4() { Assert.assertEquals("IV", ToRome(4)); }
	 * 
	 * @Test public void test6() { Assert.assertEquals("VI", ToRome(6)); }
	 * 
	 * @Test public void test9() { Assert.assertEquals("IX", ToRome(9)); }
	 * 
	 * @Test public void test10() { Assert.assertEquals("X", ToRome(10)); }
	 * 
	 * @Test public void test50() { Assert.assertEquals("L", ToRome(50)); }
	 * 
	 * @Test public void test500() { Assert.assertEquals("D", ToRome(500)); }
	 * 
	 * @Test public void test100() { Assert.assertEquals("C", ToRome(100)); }
	 * 
	 * @Test public void test1000() { Assert.assertEquals("M", ToRome(1000)); }
	 * 
	 * @Test public void test1502() { Assert.assertEquals("MDII", ToRome(1502)); }
	 * 
	 * @Test public void test1900() { Assert.assertEquals("MCM", ToRome(1900)); }
	 * 
	 * @Test public void test1998() { Assert.assertEquals("MCMXCVIII",
	 * ToRome(1998)); }
	 */
	@Test
	public void test1999() {
		Assert.assertEquals("MCMXCIX", toRome(1999));
	}
	public static String toRome(int n) {
		String Rome = "";
		int m = n / 1000;
		int mm = n % 1000;
		if (mm >= 900 && m < 1) {
			Rome = Rome + "C" + "M";
		}
		for (int i = 0; i < m; i++) {
			Rome = Rome + "M";
		}
		if (mm >= 900 && m >= 1) {
			Rome = Rome + "C" + "M";
		}
		if (mm == 0) {
			return Rome;
		}
		if (mm >= 900 && m < 1) {
			Rome = Rome + "C" + "D";
		}
		if (mm >= 500 && mm < 900) {
			Rome = Rome + "D";
		}
		if (mm >= 400 && mm < 500) {
			Rome = Rome + "C" + "D";
		}
		if (mm % 500 == 0) {
			return Rome;
		}

		 if (mm % 500 > 90 && mm % 500 < 100) {
		 Rome = Rome + "X" + "C";
		 }
if(mm%500/100<4) {
		for (int i = 0; i < mm % 500 / 100; i++) {
			Rome = Rome + "C";
		}}

		if (mm % 100 >= 90 && mm % 500 / 100 > 0) {
			Rome = Rome + "X" + "C";
		}
		if (mm % 100 == 0) {
			return Rome;
		}

		if (mm % 100 >= 40 && mm % 100 < 50) {
			Rome = Rome + "X" + "L";
		}
		if(mm%100<90) {
		for (int j2 = 0; j2 < mm % 100 / 50; j2++) {
			Rome = Rome + "L";
		}}
		// if (mm % 50 >= 40 && mm % 100 / 50 > 0) {
		// Rome = Rome + "X" + "L";
		// }
		if (mm % 50 == 0) {
			return Rome;
		}

		if (mm % 50 == 9) {
			Rome = Rome + "I" + "X";
			return Rome;
		}
		if (mm % 50 / 10 < 4) {
			for (int k = 0; k < mm % 50 / 10; k++) {
				Rome = Rome + "X";
			}
		}
		if (mm % 50 % 10 == 9 && mm % 50 / 10 > 0) {
			Rome = Rome + "I" + "X";
			return Rome;
		}
		if (mm % 10 == 0) {
			return Rome;
		}

		if (mm % 10 == 4) {
			Rome = Rome + "I" + "V";
			return Rome;
		}
		if (mm % 10 > 0) {
			for (int k2 = 0; k2 < mm % 10 / 5; k2++) {
				Rome = Rome + "V";
			}
			if (mm % 5 == 0) {
				return Rome;
			}
			if (mm % 5 <= 3) {
				for (int i = 0; i < mm % 5; i++) {
					Rome = Rome + "I";
				}
			}
		}
		return Rome;

	}

}
