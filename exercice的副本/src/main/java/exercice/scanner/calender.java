package exercice.scanner;

import java.util.Scanner;

public class calender {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//定义变量；年，月，天数
		int year = -1, month = -1, dayofmonth = -1;// 初值给一个永远不可能的值方便计算
		System.out.print("年");
		year = input.nextInt();
		System.out.print("月份");
		month = input.nextInt();
		// 根据月份计算当月的天数，2月默认28天
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayofmonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayofmonth = 30;
			break;
		case 2:
			dayofmonth = 28;
			break;
		default:
			System.out.println("只能输入1到12之间的整数");
			System.exit(0);
		}
		// 若输入年份是闰年，月份天数+1
		boolean isleapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		if (isleapyear) {
			dayofmonth++;
		}
		System.out.println(year + "年" + month + "月有" + dayofmonth + "天");

	}

}
