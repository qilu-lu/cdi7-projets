package seul;

public class Frame {
	int frameNum;
	Integer score1;
	Integer score2;
	Integer score3;

	public Integer getScore1() {
		return score1;
	}

	public void setScore1(Integer score1) {
		this.score1 = score1;
	}

	public Integer getScore2() {
		return score2;
	}

	public void setScore2(Integer score2) {
		this.score2 = score2;
	}

	public Integer getScore3() {
		return score3;
	}

	public void setScore3(Integer score3) {
		this.score3 = score3;
	}

	public int getFrameNum() {
		return frameNum;
	}

	public void setFrameNum(int frameNum) {
		this.frameNum = frameNum;
	}

	public Frame(int frame, String score) {// X ou 5/ ou 5/X
		super();
		String[] s = score.split("");
		if (frame < 10) {
			this.score1 = computeScore(s[0]);
			if (s.length > 1)
				this.score2 = computeScore(s[1]);
		}
		if (frame == 10) {
			this.score1 = computeScore(s[0]);
			if (s.length > 1)
				this.score2 = computeScore(s[1]);
			if (s.length > 2)
				this.score3 = computeScore(s[2]);
		}
	}

	private Integer computeScore(String score) {
		String f = score.replace("X", "10");
		f = f.replace("-", "0");
		if (f.contains("/"))
			f = f.replace("/", String.valueOf(10 - score1));

		return Integer.parseInt(f);
	}

	public boolean isSpare() {
		if (!isStrike() && score1 + score2 == 10) {
			return true;
		}
		return false;
	}

	public boolean isStrike() {
		if (score1 == 10) {
			return true;
		}
		return false;
	}

	public int computeScore(Frame framPre, Frame nextFrame, Frame nnextFrame) {
		int sf = 0;
		if (isSpare() == true && nextFrame != null) {
			sf = sf + 10 + nextFrame.getScore1();
		}
		if (isStrike() == true && nextFrame != null) {
			if (nextFrame.getScore2() != null) {
				sf = sf + 10 + nextFrame.getScore1() + nextFrame.getScore2();
			} else {
				sf = sf + 10 + nextFrame.getScore1() + nnextFrame.getScore1();
			}
		}
		if (isSpare() == false && isStrike() == false && nextFrame != null) {
			sf = sf + framPre.getScore1() + framPre.getScore2();
		}

		return sf;
	}

	public int computeScore10(Frame score) {
		int f = 0;
		if (score.getScore1() == 10) {
			f = f + 10 + score.getScore2() + score.getScore3();
		}
		if (score.getScore1() != 10 && score.getScore1() + score.getScore2() == 10) {
			f = f + 10 + score.getScore3();
		}
		if (score.getScore1() != 10 && score.getScore1() + score.getScore2() != 10) {
			f = f + score.getScore1() + score.getScore2();
		}
		return f;
	}
}
