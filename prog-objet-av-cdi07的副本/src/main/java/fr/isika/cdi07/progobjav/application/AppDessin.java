package fr.isika.cdi07.progobjav.application;

import fr.isika.cdi07.progobjav.AdditionFigure;
import fr.isika.cdi07.progobjav.Cercle;
import fr.isika.cdi07.progobjav.FigureGeometrique;
import fr.isika.cdi07.progobjav.InterfaceFonctionnelle;
import fr.isika.cdi07.progobjav.Parallelepipede;
import fr.isika.cdi07.progobjav.Point;
import fr.isika.cdi07.progobjav.Rectangle;
import fr.isika.cdi07.progobjav.Sphere;
import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueException;
import fr.isika.cdi07.progobjav.exceptions.FigureGeometriqueOrigineExcepton;

public class AppDessin {
	public static void main(String[] args) throws FigureGeometriqueException, FigureGeometriqueOrigineExcepton {
//		FigureGeometrique point1 = new Point();
//		System.out.println(point1.toString());
//		Point point2 = new Point();
//
//		FigureGeometrique cercle1 = new Cercle("cercle",point2, 2f);
//		System.out.println(cercle1.toString());
//
//		FigureGeometrique restangle1 = new Rectangle("rectangle",point2, 2f, 4f);
//		System.out.println(restangle1.toString());
//
//		FigureGeometrique sphere1 = new Sphere("sphere",point2, 2f);
//		System.out.println(sphere1.toString());
		AppDessin appDessin = new AppDessin();
	}

	public AppDessin() {

		try {
			String nom = null;
			Point p1 = new Point("p1", 2f, 3f, 4f);
			Point p2 = new Point("p2", 10f, 2f, 3f);
			Rectangle r1 = new Rectangle("R1", p1, 5f, 4f);
			Cercle c1 = new Cercle("c1", p1, 5f);
			Parallelepipede pa = new Parallelepipede("pa", p1, 5f, 6f, 4f);

			int t;
			t = c1.estPlusGrandQue(r1);
			if (t == 0) {
				System.out.println("les figurs sont equivalant");
			}
			if (t > 0) {
				System.out.println("les surface de c1 est plus grand");
			}
			if (t < 0) {
				System.out.println("les surface de R1 est plus grand");
			}
			System.out.println(t);
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(r1);
			System.out.println(c1);
			System.out.println(pa);
			System.out.println(c1.nommer());
			FigureGeometrique sp1 = new Sphere("sphere", p2, 2f);
			FigureGeometrique[] tab = { p1, p2, r1, sp1 };
			for (int i = 0; i < tab.length - 1; i++) {
				if (tab[i].estPlusGrandQue(tab[i + 1]) == 1)
					;
				System.out.println(i + "plus grand");

			}
			// class anonyme
//			InterfaceFonctionnelle infn = new InterfaceFonctionnelle() {
//
//				@Override
//				public String afficher() {
//					// TODO Auto-generated method stub
//					return "Bonjour tout le monde";
//				}
//			};
//			System.out.println("class anonyme " + infn.afficher());
//lambda expression
			InterfaceFonctionnelle interfonc = () -> "Exemple de lambda";
			// int i=9;
			// ()里会根据method放东西
			System.out.println("lambda expression " + interfonc.afficher());
			InterfaceFonctionnelle toto = () -> "coucou";
			System.out.println("lambda expression  " + toto.afficher());

			AdditionFigure af = (f1, f2) -> f1.getSurface() + f2.getSurface();
			System.out.println("lambda expression  " + af.additionner(p1, r1));

		} catch (FigureGeometriqueException e) {
			// 所有有exception的methode 引用都要try
			System.out.println("Attention!jfdsljfdskjf");
			System.out.println(e.getMessage());
		} catch (FigureGeometriqueOrigineExcepton e) {
			System.out.println("bb!jfdsljfdskjf");
			System.out.println(e.getMessage());
		}

	}

}