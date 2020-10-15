package seul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class RomeCalculator {
	private static final String String = null;

	@Test
	public void testOnePlusOneShouldEqualTwo() {
		RomeCalculator calculator = new RomeCalculator();
		calculator.enter("I");
		calculator.enter("I");
		assertEquals("II", calculator.add());
	}

	@Test
	public void test2() {
		RomeCalculator calculator = new RomeCalculator();
		calculator.enter("IX");
		calculator.enter("I");
		assertEquals("X", calculator.add());
	}

	@Test
	public void test3() {
		RomeCalculator calculator = new RomeCalculator();
		calculator.enter("IV");
		calculator.enter("I");
		assertEquals("V", calculator.add());
	}

	@Test
	public void test4() {
		RomeCalculator calculator = new RomeCalculator();
		calculator.enter("IV");
		calculator.enter("II");
		assertEquals("VI", calculator.add());
	}

	@Test
	public void test5() {
		RomeCalculator calculator = new RomeCalculator();
		calculator.enter("IV");
		calculator.enter("V");
		assertEquals("IX", calculator.add());
	}

	private List<String> l = new ArrayList<String>();

	private void enter(String string) {
		l.add(string);
	}

	public String add() {
		String r = "";
		int c = 0;
		for (int i = 0; i < l.size(); i++) {
			c = c + romanToInt(l.get(i));
		}

		r = RomeNumber.toRome(c);
		return r;

	}

	public static int romanToInt(String s) {
		int sum = 0;
		int preNum = getValue(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			int num = getValue(s.charAt(i));
			if (preNum < num) {
				sum -= preNum;
			} else {
				sum += preNum;
			}
			preNum = num;
		}
		sum += preNum;
		return sum;
	}

	private static int getValue(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default: {
			// 这里也可以抛出异常，反正都不会跑到这里来
			return 0;
		}
		}
	}
}