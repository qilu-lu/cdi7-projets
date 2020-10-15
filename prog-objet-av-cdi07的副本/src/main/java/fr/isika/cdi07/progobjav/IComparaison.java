package fr.isika.cdi07.progobjav;

import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueException;

public interface IComparaison extends IMesurable,INommable{
//tous ce que on trouver dans interface sont abstrait
	/*
	 * @return
	 * 1 si l'objet est>autre
	 * 0 si==
	 * -1 si l'objet est<autre
	 */
	int estPlusGrandQue(IComparaison autre) throws FigureGeometriqueException;
	
}
