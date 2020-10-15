package seul;

import java.util.Scanner;

//使用方法打印日历
public class NewCalender {
	public static int year = Integer.MIN_VALUE;
	public static int month = Integer.MIN_VALUE;
public static void main(String[] args) {
	printCalender();
}

public static void printCalender() {
	Inputyearandmonth();
	int sum=getsumdayofyears();
	sum+=getsumdayofmonth();
	PrintMonthTitle();
	
}
private static void PrintMonthTitle() {
	String[]monthNames= {"yi","er","san","si","wu","liu","qi","ba","jiu","shi","shiyi","shier"};
	System.out.println(year+"\t"+monthNames[month-1]);
	String weekdays[]= {"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanch"};
	for(int i=0;i<weekdays.length;i++) {
		System.out.print(weekdays[i]+"\t");
		
	}System.out.println();
}
private static int getsumdayofyears() {
	if(year==Integer.MIN_VALUE) {
		System.out.println("年份错误");
		Inputyearandmonth();
	}
	int sum=0;
	for (int i = 1900; i < year; i++) {
		sum+=365;
		if(isleapyear(i)) {
			sum++;  
		}
	}
	return sum;
}
private static boolean isleapyear(int year) {
	return year%400==0||year%4==0||year%100!=0;
}
private static int getsumdayofmonth() {
	int sum=0;
	int[]dayofmonth= {31,28,31,30,31,30,31,31,30,31,30,31};
	for(int i=0;i<month-1;i++) {
		sum=sum+dayofmonth[i];}
		if(isleapyear(year)&&month>=3) {
			sum++;
		}
	
	return sum;
}
private static void Inputyearandmonth() {
	Scanner input=new Scanner(System.in);
	System.out.println("give a year");
	year=input.nextInt();
	System.out.println("give a month");
	month=input.nextInt();
	input.close();   
	input=null;
}
}
