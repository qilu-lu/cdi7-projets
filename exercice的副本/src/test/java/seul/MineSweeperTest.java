package seul;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MineSweeperTest {
	@Test
	public void testMineSweeperInput() {
		MinesWeeper mw = new MinesWeeper();
		int n = 4;
		int m = 5;
		int nbMine = 2;
		String[][] input = mw.generateInput(m, n, nbMine);

		Assertions.assertThat(input.length).isEqualTo(m);
		Assertions.assertThat(input[0].length).isEqualTo(n);
		int mineSeen = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j].equals("*")) {
					mineSeen++;
				}
			}
		}
		Assertions.assertThat(mineSeen).isEqualTo(nbMine);

	}

	@Test
	public void testMineSweeperOutput() {
		MinesWeeper mw = new MinesWeeper();
		String[][] input = { { ".", ".", ".", "." }, { ".", ".", ".", "." }, { ".", ".", ".", "*" },
				{ "*", ".", ".", "." } };
		String[][] output = mw.output(input);

		String[][] expected0 = { { "0", "0", "0", "0" }, { "0", "0", "1", "1" }, { "1", "1", "1", "*" },
				{ "*", "1", "1", "1" } };

		Assertions.assertThat(output).isEqualTo(expected0);
	}
}
