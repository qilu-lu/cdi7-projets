package exerciceBalls;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {

	public static void main(String[] args) {

		List<ColorBall> balls = new ArrayList<ColorBall>();
		balls.add(ColorBall.BLUE);
		balls.add(ColorBall.RED);
		balls.add(ColorBall.RED);
		balls.add(ColorBall.GREEN);

		List<ColorBall> ret = parse("B R R G");
		System.out.println(ret.equals(balls));

		balls.add(ColorBall.GREEN);
		ret = parse("B R R G G");
		System.out.println(ret.equals(balls));

		System.out.println(findRedFollowers("B R R G"));

	}

	public static List<ColorBall> parse(String stringBalls) {
		String[] ballsAsString = stringBalls.split(" ");

		List<ColorBall> balls = new ArrayList<ColorBall>();
		for (String c : ballsAsString) {
			if (c.equals("B")) {
				balls.add(ColorBall.BLUE);

			}
			if (c.equals("R")) {
				balls.add(ColorBall.RED);

			}
			if (c.equals("G")) {
				balls.add(ColorBall.GREEN);
			}
		}

		return balls;

	}

	public static List<ColorBall> removeGreen(String stringBalls) {

		List<ColorBall> balls = parse(stringBalls);

		Iterator<ColorBall> iterator = balls.iterator();
		while (iterator.hasNext()) {
			ColorBall colorball = iterator.next();
			if (colorball.equals(ColorBall.GREEN)) {
				iterator.remove();
			}
		}

		return balls;

	}

	public static List<ColorBall> findRedFollowers(final String stringBalls) {
		List<ColorBall> balls2 = new ArrayList<>();
		List<ColorBall> balls = removeGreen(stringBalls);

		for (int i = 0; i < balls.size(); i++) {
			if (balls.get(i).equals(ColorBall.RED)) {
				int index = i + 1;
				if (index < balls.size()) {
					balls2.add(balls.get(index));
				}
			}

		}
		return balls2;

	}
}