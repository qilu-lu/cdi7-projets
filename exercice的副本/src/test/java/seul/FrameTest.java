package seul;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FrameTest {
	@Test
	public void testFrame() {
	Assertions.assertThat(new Frame(1, "X").score1).isEqualTo(10);
		Assertions.assertThat(new Frame(1, "5/").score1).isEqualTo(5);
		Assertions.assertThat(new Frame(10, "5/X").score1).isEqualTo(5);
		
		Assertions.assertThat(Bowling.score2("X X X X X X X X X XXX")).isEqualTo(300);
		Assertions.assertThat(Bowling.score2("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-")).isEqualTo(90);
		Assertions.assertThat(Bowling.score2("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5")).isEqualTo(150);
		
		Assertions.assertThat(Bowling.score2("2/ 53 5/ 62 7/ 8/ 21 3/ 54 71")).isEqualTo(112);
		
	}
}
