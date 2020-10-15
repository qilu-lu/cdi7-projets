package seul;

import java.util.Scanner;

public class Mycalculator_dowhile {
	public static void main(String[] args) {
		
	
	Scanner scanne=new Scanner(System.in);
	
	
	String choice;
	do {
		System.out.print("give 2 number");
		double num1=scanne.nextDouble();
		double num2=scanne.nextDouble();
		System.out.print("运算符");
		String op=scanne.next();
		switch (op) {
		case "+":
			System.out.print(num1+op+num2+"="+(num1+num2));
			break;
		case "-":
			System.out.print(num1+op+num2+"="+(num1-num2));
			break;
		case "*":
			System.out.print(num1+op+num2+"="+(num1*num2));
			break;
		case "/":
			if(num2==0) {
				System.out.println("cant 0");
			}else {
				System.out.print(num1+op+num2+"="+(num1/num2));
			}
			System.out.print(num1/num2);
			break;
		case "%":
			System.out.print(num1+op+num2+"="+(num1%num2));
			break;
		default:
			System.out.print("unknown operator");
			break;
		}
	
		System.out.print("continuer?y/n");
		choice=scanne.next();
	}while("y".equalsIgnoreCase(choice));
}}