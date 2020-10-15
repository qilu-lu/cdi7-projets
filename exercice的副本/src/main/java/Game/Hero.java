package Game;

public abstract class Hero implements Assailable {
	private long id;
	private String name;
	private int level;
	private int maxHp;
	private int hp;
	private int attack;
	private int x;
	private int y;
	public Hero() {
		setMaxHp(100);
		setHp(100);
	}
	public Hero(long id,String name) {
		this();
		setId(id);
		setName(name);
	}
	//使用模版模式实现的对战方法，规定了默认情况下对战的流程
		public void PK(Assailable assa) {
			//1计算距离是否能攻击到对方2如果可以就调用攻击方法3在控制台打印对战后的结果（控制台程序专用）
			if(canFightByDistance(assa)&&hp>0&&assa.getHp()>0) {
				fight(assa);
			}else {
				System.out.println("攻击失败");
			}
			System.out.println("两位英雄的当前状态");
			System.out.println("昵称\tHP\tX坐标\tY坐标");
			System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
			System.out.printf("%s\t%d\t%d\t%d\t",assa.getName(),assa.getHp(),assa.getX(),assa.getY());
		}
	public boolean canFightByDistance(Assailable assa) {
		return false;
	}
	//根据随机生成的攻击力减hp值
	public  void fight (Assailable assa) {
	
	}
	
	protected double getDistance(int x1,int y1,int x2,int y2) {
		return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level<0||level>100) {
			this.level=1;
		}else
		this.level = level;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
