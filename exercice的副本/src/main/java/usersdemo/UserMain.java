package usersdemo;

import java.util.Scanner;

public class UserMain {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	//System.out.println("请输入用户名");
	//String userName=input.next();
	System.out.println("请输入密码");
	String password=input.next();
	System.out.println(Userutil.validatePassword(password));
	//System.out.println("请输入邮箱"); 
	//String email=input.next();
}
}
 