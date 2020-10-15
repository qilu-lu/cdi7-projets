package tennis;

public class TennisGame {

	private Player player1;
	private Player player2;

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public TennisGame(Player player1, Player player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
	}

	public String jouer() {
		String n = null;
		if (isGagner()) {
			n = gagner() + " " + player1.getName() + player1.getScore() + " " + player2.getName() + player2.getScore();
		}
		if (isDeuce()) {
			n = "deuce " + player1.getNotes();
		}
		if (isAdvantage()) {
			n = "adventure " + player1.getName() + player1.getScore() + player2.getName() + player2.getScore();
		}
		if (player1.getScore() < 3 || player2.getScore() < 3) {
			n = player1.getName() + " " + player1.getNotes() + " " + player2.getName() + " " + player2.getNotes();
		}
		return n;
	}

	public boolean isGagner() {
		if (player1.getScore() >= 4 && player2.getScore() >= 4
				&& Math.abs(player2.getScore() - player1.getScore()) == 2) {
			return true;
		}
		return false;

	}

	public String gagner() {
		if (player1.getScore() >= 4 && player2.getScore() >= 4
				&& Math.abs(player2.getScore() - player1.getScore()) == 2) {
			if (player1.getScore() > player2.getScore()) {
				return player1.getName() + "gagne";
			} else {
				return player2.getName() + "gagne";
			}
		}
		return null;

	}

	public boolean isDeuce() {
		if (player1.getScore() >= 3 && player1.getScore() == player2.getScore()) {
			return true;
		}
		return false;

	}

	public boolean isAdvantage() {
		if (player1.getScore() >= 4 && player1.getScore() == player2.getScore() + 1) {
			return true;
		}
		if (player2.getScore() >= 4 && player2.getScore() == player1.getScore() + 1) {
			return true;
		}

		return false;

	}

}