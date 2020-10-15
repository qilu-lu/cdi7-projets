package seul;

import java.util.ArrayList;
import java.util.List;

public class Numberpremium {
	public static void main(String[] args) {
		System.out.println(sum(10));
		System.out.println(Np());
	}

	public static int sum(int n) {
		int sum=0;
		for (int i = 0; i < n; i++) {
		sum+=Np().get(i);
		}

		return sum;

	}

	public static List<Integer> Np() {

		List<Integer> nombre = new ArrayList<Integer>();
		nombre.add(2);
		boolean pn=false;
		for (int i = 3; i <= 100; i++) {

			for (int j = 2; j < i;j++) {
				int b = i % j;

				if (b == 0) {
					pn=false;
					break;
				} 
				else {
					pn=true;
				}
			}
			if(pn==true) {
				nombre.add(i);
			}
		}
		return nombre;
	}
}
