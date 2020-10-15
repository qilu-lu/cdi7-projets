package pile;

public class PileTest {
	public static void main(String[] args) throws Exception {
		pile3 pile = new pile3();
		// for (int i = 0; i < 10; i++) {
		// pile.empiler(i);
		// }

		pile.empiler(28);
		pile.empiler(33);

		System.out.println(pile.depiler());
		pile.empiler(80);
		System.out.println(pile.depiler());
	}
}
