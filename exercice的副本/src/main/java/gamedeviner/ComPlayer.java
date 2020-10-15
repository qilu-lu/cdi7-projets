package gamedeviner;

public class ComPlayer {
	//静态常量出拳类型的信息
	public static final int MessageTypeFist=1;
	//	赢得比赛的信息
	public static final int MessageTypeWin=2;
	public static final int MessageTypeLose=3;
//属性；名称 分数 所出的拳 角色的个性化台词
	private String name;
	private int score;
	private int fist;
	//角色在出拳的时候所说的个性化台词
	private String[]fistWords= {
			"1动感光波",
			"2大象鼻子这么长",
			"3必杀",
			"4大姐姐",
			"5吃我一拳"
	};
	private String[]winWords= {
			"1还有谁",
			"2有点意思",
			"3chaoshen",
			"4全军出击",
			"5吃着火锅唱着歌"
			
	};
	private String[]loseWords= {
			"1shigongzhong",
			"2qiong",
			"3summer is not good",
			"4summer is not good2",
			"5summer is not good3"
	};//方法 设置和得到的名称，分数，说个性化台词，出拳
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
		fist=((int)(Math.random()*30000))%3+1;
		return fist;
	}
	
	//根据传入的消息类型 随机打印对应类型的消息
	public void sendMessage(int msgType){
		//随机生成一个0-4之间的随机数
		int index=((int)(Math.random()*1000))%5;
		String message=null;//要打印的消息
		switch(msgType) {
		case MessageTypeFist:
			message=fistWords[index];
			break;
		case MessageTypeWin:
			message=winWords[index];
			break;
		case MessageTypeLose:
			message=loseWords[index];
			break;	
		}
		System.out.println(message);
	}
	
	
	
}
