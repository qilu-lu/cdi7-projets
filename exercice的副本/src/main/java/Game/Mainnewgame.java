package Game;

public class Mainnewgame {
	public static void main(String[] args) {
		Hero hero1=new Warrior(1, "傻子", 0, 0);
		Castle castle1=new Castle("温莎城堡", 5, 5, 800);
		hero1.PK(castle1);
		castle1.PK(hero1);
	}

}
