package seul;

public class Hero {
	private long id;
	private String nickName;
	private int level;
	private long currExp;//当前经验值
	private long exp;//固定值，当前级别升级所需的经验值
	public Hero() {
		super();
		
	}
	public Hero(String nickName) {
		this.setNickName(nickName);
	}
	public Hero(long id, String nickName, int level, long exp) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.level = level;
		this.exp = exp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	private void setNickName(String nickName) {
		if(null==nickName) {
			nickName="unknown hero";
		}
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level<1||level>99) {
			this.level=1;
		}else 
		this.level = level;
	}
	public long getCurrExp() {
		return currExp;
	}
	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}
	public long getExp() {
		exp=((long)Math.pow(level-1, 3)+60)/5*((level-1)*2+60);
		return exp;
	}
	//public void setExp(long exp) {
	//	this.exp = exp;
	//}因为每个玩家升级所需的经验值是固定公式计算的，所以不需要手动调用。
	
	

}
