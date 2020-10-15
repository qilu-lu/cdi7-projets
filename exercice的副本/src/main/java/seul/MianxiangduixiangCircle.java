package seul;

public class MianxiangduixiangCircle {

	private static double PI = 3.14159265;
	private double ridum;

	public static double getPI() {
		return PI;
	}

	public MianxiangduixiangCircle() {
	}

	public MianxiangduixiangCircle(double ridum) {
		this.ridum = ridum;
	}

	public double getSurface() {
		Double surface = ridum * ridum * PI;
		return surface;
	}

	public double getRidum() {
		return ridum;
	}

	public void setRidum(double ridum) {
		this.ridum = ridum;
	}

	public double getZhouchang() {
		Double 周长 = 2 * ridum * PI;
		return 周长;
	}

	@Override
	public String toString() {
		return "MianxiangduixiangCircle [ridum=" + ridum + ", surface=" + getSurface() + ", 周长=" + getZhouchang() + "]";
	}

	public void show() {
		System.out.print("圆的半径为" + ridum + "面积为" + getSurface() + "zhouchang" + getZhouchang());
	}
}