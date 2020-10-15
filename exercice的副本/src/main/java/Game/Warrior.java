package Game;

public class Warrior extends Hero {
	public Warrior() {
		super();
		setName("默认英雄");
	}

	public Warrior(long id, String name, int x, int y) {
		super(id, name);
		setX(x);
		setY(y);
	}

	@Override
	public boolean canFightByDistance(Assailable hero1) {
		double distance = getDistance(getX(), getY(), hero1.getX(), hero1.getY());
		// 假设战士的攻击距离固定为100

		if (distance <= 100) {
			return true;
		}
		return false;
	}

	@Override
	public void fight(Assailable hero1) {
	 	int attack=((int)(Math.random()*10000))%51+20;//20-70之间
		setAttack(attack);
		hero1.setHp(hero1.getHp()-attack);
	 	

	}
}
