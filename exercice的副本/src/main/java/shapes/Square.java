package shapes;

public class Square extends Shape {

	private double side;

	public Square(double x, double y, double side) {
		super(x, y);
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
