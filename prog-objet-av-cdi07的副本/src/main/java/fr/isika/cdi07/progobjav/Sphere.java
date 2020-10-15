package fr.isika.cdi07.progobjav;

import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueException;
import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueOrigineExcepton;

public class Sphere extends Cercle {

	private Double volume;

	public Sphere() {
		super();
		this.dimension = Dimension.Trois;
		this.volume = calculerVolume();
	}

	public Sphere(String nom, Point hautGauche, float r)
			throws FigureGeometriqueException, FigureGeometriqueOrigineExcepton {
		super(nom, hautGauche, r);

		this.dimension = Dimension.Trois;
		this.volume = calculerVolume();
	}

	protected Double calculerVolume() {
		volume = (this.getR() * this.getR() * this.getR() * Math.PI);
		return volume;

	}

	public void setR(float rayon) {
		super.setR(rayon);
		this.surface = this.calculerSurface();
		this.volume = this.calculerVolume();
	}

	@Override
	protected Double calculerSurface() {
		surface = 4 * Math.pow(this.r, 2) * Math.PI;
		// 4*super.calculerSurface();
		return surface;
	}

	@Override
	public String toString() {
		return "Sphere [nom=" + nom + ", Volume=" + calculerVolume() + ", dimension=" + dimension + "]";
	}
}