package exercice.scanner;

import java.util.Scanner; 

public class rmbconverse {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("how much you have");
	double money=input.nextDouble();
	
	int yuan =(int) money;
	int numofshiyuan=yuan/10;
	int numofwuyuan=yuan%10/5;
	int numofyiyuan=yuan%-5;
	
	int jiao=((int)(money*10))%10;
	int numofwuhiao=jiao/5;
	int numofyijiao=jiao-5;
	System.out.println("十元纸币的数量"+numofshiyuan);
	System.out.println("五元纸币的数量"+numofwuyuan);
	
	}
}
