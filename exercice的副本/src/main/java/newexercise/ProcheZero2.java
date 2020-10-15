package newexercise;

import java.util.ArrayList;
import java.util.List;

public class ProcheZero2 {

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
		
		System.out.println(PlusZero(nombre));

	}

	public static Double PlusZero(List<Double> nombre) {
		double min = nombre.get(0);
		for (int i = 1; i < nombre.size(); i++) {
			if (Math.abs(nombre.get(i)) < Math.abs(min)) {
				min = nombre.get(i);
			} else if (Math.abs(nombre.get(i)) == Math.abs(min)) {
				min = nombre.get(i) > 0 ? nombre.get(i) : min;
			}

		}
		return min;

	}

}
