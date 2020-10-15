package monnais;

public class ListUtil {
	// Do not modify this method‌‌‌‌‌‌‌‌‌ signature
	static Change optimalChange(long s) {
		Change c = new Change();
		if (s / 10 >= 1 && s % 5 % 2 == 0) {
			long bill10 = s / 10;
			long bill5 = (s - (bill10 * 10)) / 5;
			long coin2 = (s % 5) / 2;
			c.setBill10(bill10);
			c.setBill5(bill5);
			c.setCoin2(coin2);
		}
		if (s / 10 >= 1 && s % 5 % 2 != 0) {
			long bill10 = s / 10;
			long bill5 = 0;
			long coin2 = ((s - (bill10 * 10)) % 5) / 2;
			c.setBill10(bill10);
			c.setBill5(bill5);
			c.setCoin2(coin2);
		}
		if (s < 10 && s / 5 == 1 && s % 5 % 2 != 0) {
			long bill10 = 0;
			long bill5 = 0;
			long coin2 = s / 2;
			c.setBill10(bill10);
			c.setBill5(bill5);
			c.setCoin2(coin2);
		}
		if (s < 10 && s / 5 == 1 && s % 5 % 2 == 0) {
			long bill10 = 0;
			long bill5 = 1;
			long coin2 = (s - 5) / 2;
			c.setBill10(bill10);
			c.setBill5(bill5);
			c.setCoin2(coin2);

		}

		return c;

	}
}
