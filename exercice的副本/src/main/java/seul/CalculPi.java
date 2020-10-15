package seul;

public class CalculPi {
	public static void main(String[] args) {
		double[][] pts = new double[1000000][2];
		for (int i = 0; i < 1000000; i++) {
			pts[i][0] = Math.random();
			pts[i][1] = Math.random();
		}
		System.out.println(approx(pts));
	}

	static double approx(double[][] pts) {

		int count = 0;
		double pi = 0;
		for (int i = 0; i < pts.length; i++) {
			if (pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1] <= 1) {
				count++;
			}
			
		}
		pi = 4. * count / pts.length;
		return pi;
	}
}
