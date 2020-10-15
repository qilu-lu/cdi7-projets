package gamedeviner;

public class HumanPlayer {
	// 静态常量出拳类型的信息
	public static final int MessageTypeFist = 1;
	// 赢得比赛的信息
	public static final int MessageTypeWin = 2;
	public static final int MessageTypeLose = 3;
//属性；名称 分数 所出的拳 角色的个性化台词
	private String name;
	private int score;
	private int fist;
	// 角色在出拳的时候所说的个性化台词
	private String[] fistWords = { "动感光波", "大象鼻子这么长", "必杀", "大姐姐", "吃我一拳" };
	private String[] winWords = { "还有谁", "有点意思", "chaoshen", "全军出击", "吃着火锅唱着歌"

	};
	private String[] loseWords = { "shigongzhong", "qiong", "summer is not good", "summer is not good2",
			"summer is not good3" };// 方法 设置和得到的名称，分数，说个性化台词，出拳

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

	public int getFist() {
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}

	// 根据传入的消息类型 随机打印对应类型的消息
	public void sendMessage(int msgType) {
		// 随机生成一个0-4之间的随机数
		int index = ((int) (Math.random() * 1000)) % 5;
		String message = null;// 要打印的消息
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWords[index];
			break;
		case MessageTypeLose:
			message = loseWords[index];
			break;
		}
		System.out.println(message);
	}

}
