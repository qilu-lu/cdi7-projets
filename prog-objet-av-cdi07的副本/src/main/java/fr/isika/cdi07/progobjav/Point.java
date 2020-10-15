package fr.isika.cdi07.progobjav;

import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueException;

public class Point extends FigureGeometrique {

	private float x;
	private float y;
	private float z;

	public Point(String nom, float x, float y, float z) throws FigureGeometriqueException {
		super(nom);
		this.dimension = Dimension.UN;
		this.x = x;
		this.y = y;
		this.z = z;
		calculerSurface();
	}

	public Point() {
		this.x = this.y = this.z = 0f;
		this.dimension = Dimension.UN;
		calculerSurface();
	}

	public float getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	protected Double calculerSurface() {
		surface = 0.;
		return surface;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + ", nom=" + nom + ", surface=" + calculerSurface()
				+ ", dimension=" + dimension + "]";
	}

}
