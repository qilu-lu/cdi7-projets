package cylinder;

public class Carre implements Cylinder {
	public double length;
	public double width;

	public Carre() {
	}

	public Carre(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		Double Area = length * width;
		return Area;
	}

}
