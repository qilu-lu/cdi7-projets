package cylinder;

public class Pillar {

	double depth;

	public Cylinder cylinder;

	public Cylinder getCylinder() {
		return cylinder;
	}

	public Pillar(Cylinder cylinder, double depth) {
		super();
		this.cylinder = cylinder;
		this.depth = depth;
	}

	public double volum() {
		double volum = cylinder.getArea() * depth;
		return volum;

	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

}
