package abstrait;

import java.util.Random;

public class EssaiChat {
	public static Random ddd = new Random();

	public static Animal tirage() {

		if (ddd.nextDouble() < 0.50) {

			return new Chien();
		} else {
			return new Chat();
		}
	}

	public static void main(String[] args) {

		Animal animal = tirage();
		animal.action();

	}
}
