package tennis;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TennisTest {
	@Test
	public void testTennis() {

		Player brice = new Player("brice");
		Player lu = new Player("lu");
		TennisGame game = new TennisGame(brice, lu);
		game.getPlayer1().addScore();
		game.getPlayer1().addScore();

		game.getPlayer2().addScore();
		game.getPlayer2().addScore();
		game.getPlayer2().addScore();

		String excepted = "brice thirty lu fourty";
		Assertions.assertThat(game.jouer()).isEqualTo(excepted);
	}
}
