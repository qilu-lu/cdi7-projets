package hab;

public class TestHabitation {

	public static void main(String[] args) {
		habIndividuelle();

		hab();
	}

	private static void hab() {
		// creation d’un objet de type
		Habitation h = new Habitation("Jean", "METZ", 120);

		// calcul de l’imp^ot
		double i = h.impot();

		h.affiche();
		// affichage des attributs de la classe Habitation H.Affiche();
	}

	private static void habIndividuelle() {
		HabitationIndividuelle HI = new HabitationIndividuelle("Paul", "METZ", 120, 5, false);
		double I = HI.impot();
		HI.affiche();
		System.out.println("Impots : " + HI.impot());
	}

	public static void TestHabitationProfessionnelle() {
		double I;

		HabitationProfessionnelle HP = new HabitationProfessionnelle("ImportExport", "METZ", 2500, 130);

		I = HP.impot();

		HP.affiche();
		System.out.println(HP.impot());
	}

}
