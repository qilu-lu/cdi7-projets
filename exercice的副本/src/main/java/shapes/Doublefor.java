package shapes;

public class Doublefor {
	public static void main(String[] args) {
		char ch='A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print("x");

			}
			for (int x = 0; x <= 2 * i; x++) {
				System.out.print((char)(ch+i));
			}

			System.out.println();

		}}}
		/*for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= 4-2*i; j++) {
				System.out.print((char)(ch+i+4));
			}System.out.println();
		}
	}
}*/