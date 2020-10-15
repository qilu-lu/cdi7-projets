
package shapes;

import java.util.ArrayList;
import java.util.List;

public class exercise1 {
	public static void main(String[] args) {
		List<IShape> shapes = new ArrayList<>();
		IShape square = new Square2(0, 0, 4);
		IShape circle = new Circle(0, 0, 4);

		shapes.add(circle);
		shapes.add(square);

		for (IShape myShape : shapes) {
			System.out.println(myShape.getArea());
			myShape.setX(myShape.getX() + 1);
		}
	}
}