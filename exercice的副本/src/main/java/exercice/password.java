package exercice;

import java.util.Scanner;

public class password {
public static void main(String[] args) {
	
	String vraipassword="2233";
	
	int i=0;
	while(i<3) {
			Scanner scanne=new Scanner(System.in);
			String password1=scanne.next();
			i++;
			if(password1.equals(vraipassword)) {
				System.out.println("ouvrir la porte");
				}
	else {
			
				System.out.println("wrong code,reste"+(3-i)+"fois" );
	}
}

}
}