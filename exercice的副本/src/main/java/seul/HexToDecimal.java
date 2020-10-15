package seul;

import java.util.Scanner;

public class HexToDecimal {
	public static void main(String[] args) {
		// 1 让用户输入10进止数字
		// 2调用方法将10转换成16
		// 3再将16进制转换成10
		Scanner scanne = new Scanner(System.in);
		System.out.print("give a number");
		int decNum = scanne.nextInt();
		System.out.println(HexToDec(decNum));
	}

	public static String DecToHex(int decNum) {
		String hex = "";
		while (decNum != 0) {
			int temp = decNum % 16;
			if (temp >= 0 && temp <= 9) {
				hex = temp + hex;
			} else if (temp >= 10 && temp <= 15) {
				hex = (char) (temp - 10 + 'A') + hex;
			}
			decNum /= 16;
		}

		return hex;
	}
	public static int HexToDec(String hex) {
		int decNum=0;
		for(int i=0;i<hex.length();i++) {
			char tempchar=hex.charAt(i);
			if(tempchar>='0'&&tempchar<='9')
			decNum+=(tempchar-'0')*Math.pow(16, hex.length()-i-1);
		}
		return decNum;
	}

}