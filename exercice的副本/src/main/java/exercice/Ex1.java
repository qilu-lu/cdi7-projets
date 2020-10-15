package exercice;

import java.util.Iterator;

public class Ex1 {

	public String predictCrimes() {
		String result = "";
		for (int i = 0; i < 30; i++) {

			Integer x = (int) (Math.random() * 900 + 100);
			Integer f = (int) (Math.random() * 90 + 10);
			Integer k = (int) (Math.random() * 9000 + 1000);

			String result1 = ("Crime predicted: " + x + "-" + f + "-" + k);

			Integer w = (int) (Math.random() * 900 + 100);
			Integer u = (int) (Math.random() * 9000 + 1000);
			result1 = result1 + "\nCalling: 1" + "-" + w + "-555" + "-" + u + "\n\n";

			result = result + result1;
		}
		return result;

	}

	public static void main(String[] args) {
		String result = new Ex1().predictCrimes();
		System.out.println(result);
	}

}
