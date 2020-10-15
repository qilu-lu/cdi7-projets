package fr.isika.cdi07.progobjav;

import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueException;
import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueOrigineExcepton;

public class Cercle extends FigureGeometrique {
	protected Point hautGauche;
	protected float r;

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public Cercle(String nom, Point hautGauche, float r)
			throws FigureGeometriqueException, FigureGeometriqueOrigineExcepton {
		super(nom);
		if (hautGauche == null)
			throw new FigureGeometriqueOrigineExcepton();
		this.dimension = Dimension.DEUX;
		this.hautGauche = new Point();
		this.r = r;
		calculerSurface();

	}

	public Cercle() {
		this.nom = INCONUNE;
		this.dimension = Dimension.DEUX;
		this.hautGauche = new Point();
		this.r = 0f;
	}

	@Override
	protected Double calculerSurface() {
		surface = Math.pow(this.r, 2) * Math.PI;
		return surface;
	}

	public String toString() {
		return "Cercle [r=" + r + ", nom=" + nom + ", surface=" + surface + ", dimension=" + this.getDimension() + "]";
	}

}
