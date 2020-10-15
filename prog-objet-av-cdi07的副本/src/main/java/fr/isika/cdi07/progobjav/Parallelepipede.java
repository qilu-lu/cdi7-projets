package fr.isika.cdi07.progobjav;

import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueException;
import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueOrigineExcepton;

public class Parallelepipede extends Rectangle {
	protected double hauteur;
	private double volume;

	public Parallelepipede() {
		super();
		this.hauteur = hauteur;
		this.dimension = Dimension.Trois;
		this.volume = calculVolume();
	}

	public Parallelepipede(String nom, Point hautGauche, Float x, Float y,Float hauteur)
			throws FigureGeometriqueException, FigureGeometriqueOrigineExcepton {
		super(nom, hautGauche, x, y);
		this.hauteur = hauteur;
		this.dimension = Dimension.Trois;
		this.volume = calculVolume();

	}@Override
	protected Double calculerSurface() {
		surface =super.calculerSurface()*2+super.getX()*this.hauteur*2+super.getY()*this.hauteur*2;
		return surface;
	}


	private double calculVolume() {
		volume=super.surface*this.hauteur;
		return volume;
	}
//	public void setX(float x) {
//		super.setX(x);
//		this.surface=this.calculerSurface();
//		this.volume=this.calculVolume();
//	}
//	public void setY(float y) {
//		super.setY(y);
//		this.surface=this.calculerSurface();
//		this.volume=this.calculVolume();
//	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Parallelepipede [hauteur=" + hauteur + ", volume=" + volume + ", nom=" + nom + ", surface=" + surface
				+ ", dimension=" + dimension + "]";
	}

}
