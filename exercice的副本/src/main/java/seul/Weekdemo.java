package seul;

import java.util.Scanner;

public class Weekdemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入星期几");
		int dayofweek = input.nextInt();
		dayweekenglish(dayofweek);
	}

	private static boolean isright(int dayofweek) {
		if (dayofweek < 1 || dayofweek > 7) {
			return false;
		}
		return true;

	}

	public static void dayweekenglish(int dayofweek) {
		String[] weekday = { "lun", "mar", "mercre", "jeudi", "vend", "same", "diman" };
		if (dayofweek <= 7) {
			System.out.print(weekday[dayofweek - 1]);
		} else {
			System.out.print("numero entre 1-7");
		}

	}
}
