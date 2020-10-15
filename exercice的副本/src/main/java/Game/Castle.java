package Game;
//城堡类不是英雄
public class Castle implements Assailable {
	private String name;
private int X;
private int Y;
private int maxHp;
private int hp;
private int attackRange;
public Castle() {
	super();
}
public Castle(String name,int x,int y,int attackRange) {
	setName(name);
	setX(x);
	setY(y);
	setAttackRange(attackRange);
	setMaxHp(100);
	setHp(100);

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getX() {
	return X;
}
public void setX(int x) {
	X = x;
}
public int getY() {
	return Y;
}
public void setY(int y) {
	Y = y;
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
public int getAttackRange() {
	return attackRange;
}
public void setAttackRange(int attackRange) {
	this.attackRange = attackRange;
}
@Override
public boolean canFightByDistance(Assailable ass) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public void fight(Assailable ass) {
	int attack=15;
	ass.setHp(ass.getHp()-attack);
	
}
public void PK(Assailable assa) {
	//1计算距离是否能攻击到对方2如果可以就调用攻击方法3在控制台打印对战后的结果（控制台程序专用）
	if(canFightByDistance(assa)&&hp>0&&assa.getHp()>0) {
		fight(assa);
	}else {
		System.out.println("攻击失败");
	}
	System.out.println("两位英雄的当前状态");
	System.out.println("昵称\tHP\tX坐标\tY坐标");
	System.out.println(name+"\t"+hp+"\t"+X+"\t"+Y);
	System.out.printf("%s\t%d\t%d\t%d\t",assa.getName(),assa.getHp(),assa.getX(),assa.getY());
}
}
