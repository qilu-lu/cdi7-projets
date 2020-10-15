package newexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcheZero {
	public static void main(String[] args) {
		List<Double> nombre = new ArrayList<Double>();

		nombre.add(0.5);
		nombre.add(1.5);
		//nombre.add(0.);
		// nombre.add(1.3);
		nombre.add(-5.0);
		nombre.add(-0.3);
		nombre.add(0.5);
		nombre.add(0.3);
		nombre.add(-0.3);
		System.out.print(PlusZero(nombre));

	}

	public static Double PlusZero(List<Double> nombre) {
		double min = nombre.get(0);
		double n = 0;
		for (int i = 1; i < nombre.size() - 1; i++) {
			if (Math.abs(nombre.get(i)) < Math.abs(min)) {

				n = nombre.get(i);
				
			}

			if (Math.abs(nombre.get(i)) == Math.abs(min)) {
				if (nombre.get(i) > min) {
					n = nombre.get(i);
					
				} 
			}
			if (Math.abs(nombre.get(i)) > Math.abs(min))

				n= min;

		}
		return n;

	}
}