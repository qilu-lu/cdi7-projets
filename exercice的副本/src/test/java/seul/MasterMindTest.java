package seul;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MasterMindTest {
	@Test
	public void testMasterMind() {
		String[] secret = new String[] { "blue", "red", "green", "pink" };
		String[] guess = new String[] { "red", "blue", "green", "y" };
		String[] ret = MasterMind.evaluate(secret, guess);
		String[] expected = new String[] { "1", "3" };
		Assertions.assertThat(ret).isEqualTo(expected);
	}
}
