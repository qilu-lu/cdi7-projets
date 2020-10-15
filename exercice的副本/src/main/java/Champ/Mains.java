package Champ;

import java.util.Iterator;
import java.util.List;

public class Mains {

	private static int NB_ANIMAUX = 8;
	private static int PARCELLE_HAUTEUR = 10;
	private static int PARCELLE_LARGEUR = 10;

	public static void main(String[] args) throws InterruptedException {
		Champ champ = new Champ(PARCELLE_HAUTEUR, PARCELLE_LARGEUR);

		int nbElementCreer = (int) ((int) (Math.random() * NB_ANIMAUX) + NB_ANIMAUX * 0.2);

		for (int i = 0; i < nbElementCreer; i++) {
			Nourriture cc = new Mais();
			champ.parcelle[aleatoire(PARCELLE_HAUTEUR)][aleatoire(PARCELLE_LARGEUR)].nouriture.add(cc);

			Nourriture aa = new Ble();
			champ.parcelle[aleatoire(PARCELLE_HAUTEUR)][aleatoire(PARCELLE_LARGEUR)].nouriture.add(aa);

			Animal bb = new Biche();
			champ.parcelle[aleatoire(PARCELLE_HAUTEUR)][aleatoire(PARCELLE_LARGEUR)].animaux.add(bb);

			Animal kk = new Loup();
			champ.parcelle[aleatoire(PARCELLE_HAUTEUR)][aleatoire(PARCELLE_LARGEUR)].animaux.add(kk);
		}

		while (true) {

			for (int k = 0; k < 5; k++) {
				Nourriture cc = new Mais();
				// champ.parcelle[aleatoire(PARCELLE_HAUTEUR)][aleatoire(PARCELLE_LARGEUR)].nouriture.add(cc);

				Nourriture aa = new Ble();
				// champ.parcelle[aleatoire(PARCELLE_HAUTEUR)][aleatoire(PARCELLE_LARGEUR)].nouriture.add(aa);
			}

			for (int i = 0; i < PARCELLE_HAUTEUR; i++) {
				for (int j = 0; j < PARCELLE_LARGEUR; j++) {
					Parcelle p = champ.parcelle[i][j];

					for (Iterator<Animal> iterator = p.animaux.iterator(); iterator.hasNext();) {
						Animal animal1 = (Animal) iterator.next();

						if (animal1 instanceof Biche) {
							if (p.nouriture.size() > 0) {
								animal1.eat();
							} else {
								animal1.ajouterJourSansManger();

							}
							p.nouriture.stream().forEach(e -> System.out.println(e.getClass().getName()));
							System.out.println();
							p.nouriture.clear();
						}
						if (animal1.getJourSansManger() >= 10) {
							System.out.println("Biche Meurt");
							iterator.remove();
						} else {
							deplace(champ, champ.parcelle[i][j], i, j, animal1, iterator);
						}
					}
					Animal loup = null;
					Animal Biche = null;
					boolean loupExiste = false;
					for (Animal coco : p.animaux) {
						if (coco instanceof Loup) {
							loupExiste = true;
							loup = coco;
						}
					}
					if (loupExiste) {
						boolean aMange = false;
						for (Iterator<Animal> iterator = p.animaux.iterator(); iterator.hasNext();) {
							Animal animal = (Animal) iterator.next();
							if (animal instanceof Biche) {
								// animal.eat();
								aMange = true;
								loup.eat();
								// loup => mange /// loup.eat()
								iterator.remove();
								System.out.println("Loup mange biche");
							}
						}
						if (aMange == false) {
							loup.ajouterJourSansManger();
						}
						if (loup.getJourSansManger() >= 10) {
							System.out.println("Loup Meurt");
							p.animaux.remove(loup);
						}

					}

				}
			}
			System.out.println(champ);
			Thread.sleep(1000);
		}
	}

	public static void deplace(Champ champ, Parcelle parcelle, int i, int j, Animal animal1,
			Iterator<Animal> iterator) {

		Parcelle w = champ.parcelle[i][j];

		int maxi2 = Math.min(i + 1, PARCELLE_HAUTEUR - 1);
		int mini2 = Math.max(0, i - 1);
		int maxj2 = Math.min(j + 1, PARCELLE_LARGEUR - 1);
		int minj2 = Math.max(0, j - 1);

		int nexti2 = (int) (Math.round((Math.random() * (maxi2 - mini2)) + mini2));
		int nextj2 = (int) (Math.round((Math.random() * (maxj2 - minj2)) + minj2));

		Parcelle e = champ.parcelle[nexti2][nextj2];
		if (nexti2 != i || nextj2 != j) {
			e.animaux.add(animal1);
			iterator.remove();
		}

	}

	private static int aleatoire(int nb) {
		return (int) (Math.random() * nb);
	}
}
