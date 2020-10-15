package fr.isika.cdi07.progobjav;

import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueException;
import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueOrigineExcepton;

public class Rectangle extends FigureGeometrique {
	private Point hautGauche;
	private Float x;
	private Float y;
	
	public Rectangle() {
		nom=INCONUNE;
		dimension=Dimension.DEUX;
		this.hautGauche=new Point();
		this.x=0f;
		this.y=0f;
		this.surface=calculerSurface();
	}

	public Rectangle(String nom,Point hautGauche, Float x, Float y) throws FigureGeometriqueException, FigureGeometriqueOrigineExcepton {
		super(nom);
		if(hautGauche==null)throw new FigureGeometriqueOrigineExcepton();
		if(x==null||y==null)throw new FigureGeometriqueException("la longuer et largeur ne peut pas etre null");
		this.dimension = Dimension.DEUX;
		this.x = x;
		this.y = y;
		calculerSurface();
	}

	@Override
	protected Double calculerSurface() {
		surface =new Double(this.x * this.y);
		return surface;
	}

	public Float getX() {
		return x;
	}

	public void setX(Float x) {
		this.x = x;
	}

	public Float getY() {
		return y;
	}

	public void setY(Float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Restangle [x=" + x + ", y=" + y + ", nom=" + nom + ", surface=" + surface + ", dimension="
				+ dimension + "]";
	}

	
	
}
