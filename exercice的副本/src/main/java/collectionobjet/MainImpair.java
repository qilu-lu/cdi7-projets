package collectionobjet;

public class MainImpair {
	public static void main(String[] args) {
//		List<Integer> Impaire = new ArrayList<Integer>();
//		for (int i = 1; i < 202; i = i + 2) {
//			Impaire.add(i);
//		}
//		System.out.println(Impaire);

		Impair impair = new Impair();

		System.out.println(impair.Premier());// 1
		while (impair.IlEnReste()) {
			System.out.println(impair.Suivant());// 9
		}
	}
}
