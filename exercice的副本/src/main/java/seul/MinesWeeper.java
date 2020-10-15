package seul;

public class MinesWeeper {

	int filedNum = 0;

	public String[][] generateInput(int m, int n, int w) {
		System.out.print(m + " ");
		System.out.println(n);
		String[][] mi = new String[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mi[i][j] = ".";
			}
		}

		for (int j2 = 0; j2 < w; j2++) {
			mi[(int) (Math.random() * m)][(int) (Math.random() * n)] = "*";

		}
		return mi;
	}

	public void print(String[][] mi) {

		for (int i = 0; i < mi.length; i++) {
			for (int j = 0; j < mi[i].length; j++) {
				System.out.print(mi[i][j]);
			}
			System.out.println();
		}

	}

	public String[][] output(String[][] in) {
		System.out.println("Field #" + (++filedNum));

		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in[i].length; j++) {
				if (in[i][j] != "*") {
					int count = 0;
					for (int j2 = i - 1; j2 <= i + 1; j2++) {
						for (int k = j - 1; k <= j + 1; k++) {
							if (j2 >= 0 && k >= 0 && j2 < 4 && k < 4) {

								if (in[j2][k].equals("*")) {
									count++;
								}
							}
						}
					}
					in[i][j] = Integer.toString(count);
				} else if (in[i][j] == "*") {
					in[i][j] = "*";
				}
			}
		}
		return in;
	}
}
