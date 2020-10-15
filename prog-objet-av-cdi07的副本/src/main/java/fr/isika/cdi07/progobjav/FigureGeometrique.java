package fr.isika.cdi07.progobjav;

import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueException;

/**
 * exeample pour illustrer le cours de prog av objet
 * 
 * @author qilu
 *
 */

public abstract class FigureGeometrique implements IComparaison {
	protected String nom;
	protected Double surface;
	protected Dimension dimension;

	public final static String INCONUNE = "inconnue";

//constante 
//l'entete de la methode
	public FigureGeometrique(String nom) throws FigureGeometriqueException {
		super();
		if (nom == null)
			throw new FigureGeometriqueException("le nom de la figure est obligatoire");
		this.nom = nom;
	}

	public FigureGeometrique() {
		super();
		nom = INCONUNE;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getSurface() {
		return surface;
	}

	protected abstract Double calculerSurface();

	public Dimension getDimension() {
		return dimension;
	}

	@Override
	public String toString() {
		return "FigureGeometrique [nom=" + nom + ", surface=" + surface + ", dimension=" + dimension + "]";
	}

	@Override
	public int estPlusGrandQue(IComparaison autre) throws FigureGeometriqueException {
		FigureGeometrique fg = null;
		if (autre instanceof FigureGeometrique)
			fg = (FigureGeometrique) autre;
		else
			throw new FigureGeometriqueException("la 2eme argument n'est ps type figureGemoetrique");
		if (this.surface.compareTo(fg.getSurface()) > 0)
			return 1;
		if (this.surface == fg.surface)
			return 0;
		else
			return -1;
	}

	@Override
	public String nommer() {
		return this.nom;
	}

}
