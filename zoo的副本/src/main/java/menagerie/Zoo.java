package menagerie;

public class Zoo {
	private String nom;
	public static int nbCages = 9;
	public int nmAnimal = 0;
	public Animal[] cage;

	public Zoo(String nom, int nmAnimal) {

		this.nom = nom;
		this.nbCages = nmAnimal;
		this.cage = new Animal[nmAnimal];

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbCages() {
		return nbCages;
	}

	public void setNbCages(int nbCages) {
		this.nbCages = nbCages;
	}

	public void addAnimal(Animal animal) {
		if (nmAnimal <= nbCages) {

			this.cage[nmAnimal] = animal;
			nmAnimal++;
		} else {
			System.out.println("il y a pas de place");
		}
	}

	public Animal[] getAnimal() {
		return cage;
	}

	public void setAnimal(Animal[] animal) {
		this.cage = animal;
	}

	public void printAll(Animal[] animal) {
		System.out.println(this.nom);

		for (int i = 0; i < nmAnimal; i++) {
			System.out.println(animal[i].toString());
		}
	}

}
