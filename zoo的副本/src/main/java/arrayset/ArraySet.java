package arrayset;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySet {
	public int coucou3;
	private Object[] arrayset = new Object[5];
	private int nb; 

	public ArraySet() {
		super();
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

	public void add(Object object1) {
		for (int i = 0; i < nb; i++) {
			if (arrayset[i].equals(object1)) {
				return;
			}
		}
		if (nb <= arrayset.length - 1) {
			arrayset[nb] = object1;
			nb++;
		} else if (nb > arrayset.length - 1) {
			int length = arrayset.length;
			Object[] arrayset2 = new Object[length * 2];

			for (int i1 = 0; i1 < arrayset.length; i1++) {
				arrayset2[i1] = this.arrayset[i1];
			}
			arrayset = arrayset2;

			arrayset[length] = object1;
			nb++;
		}
	}

	@Override
	public String toString() {
		return "ArraySet [arrayset=" + Arrays.toString(arrayset) + ", nb=" + nb + "]";
	}

	public static void main(String[] args) {
		ArraySet arraySet = new ArraySet();
		arraySet.add(5);
		arraySet.add(6);
		arraySet.add(5);
		arraySet.add(8);
		arraySet.add(9);
		// arraySet.add(10);
		arraySet.add(10);
		System.out.println(arraySet.nb);
	}

}
