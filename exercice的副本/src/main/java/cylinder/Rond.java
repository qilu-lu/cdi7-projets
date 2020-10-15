package cylinder;

public class Rond implements Cylinder {
	public double r;

	public Rond() {
		super();

	}

	public Rond(double r) {
		super();
		this.r = r;
	}

	@Override
	public double getArea() {
		Double Area = r * r * Math.PI;
		return Area;
	}

}
