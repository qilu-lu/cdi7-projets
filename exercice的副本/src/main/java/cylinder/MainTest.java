package cylinder;

public class MainTest {
	public static void main(String[] args) {
		Rond rond1 = new Rond(2);

		Pillar pillarRond = new Pillar(rond1, 3.0);
		System.out.println(pillarRond.volum());
		
		Carre quart=new Carre(2,3);
		Pillar pillardQuart=new Pillar(quart,10.0);
		System.out.println(pillardQuart.volum());

	}
}
