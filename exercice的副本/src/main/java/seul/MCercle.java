package seul;

import java.util.Scanner;

public class MCercle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("give a r");
		Double ridum = input.nextDouble();
	
		MianxiangduixiangCircle mCercle = new MianxiangduixiangCircle(ridum);
		mCercle.getSurface();
		mCercle.getZhouchang();
		mCercle.show();
		MianxiangduixiangCircle.getPI();
	}
	

}
