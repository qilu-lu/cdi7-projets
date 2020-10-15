package exercice.list;

import java.util.ArrayList;
import java.util.List;

public class SurfaceCalculator {

	static List<Double> size(List<Double> r) {
		List<Double> surface = new ArrayList<>();
		for (Double number : r) {
			surface.add(3.14159265 * number * number);
		}
		return surface;
	}

	public static void main(String[] args) {
		List<Double> r = new ArrayList<>();
		r.add(2.0);

		List<Double> surface = size(r);

		System.out.println(surface);
	}
}
