package shapes;

public class Circle extends Shape {

	private double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14159265*radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 0;
	}

}
