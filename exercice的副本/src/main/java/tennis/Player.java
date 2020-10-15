package tennis;

public class Player {
	private String name;
	private int score;

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void addScore() {
		score++;
	}

	public String getNotes() {
		switch (score) {
		case 0:
			return "lovely";
		case 1:
			return "fifty";
		case 2:
			return "thirty";
		case 3:
			return "fourty";

		default: {
			// 这里也可以抛出异常，反正都不会跑到这里来
			return null;
		}
		}
	}
}
