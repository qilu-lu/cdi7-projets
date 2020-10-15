package collection;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Chicken> liste = new ArrayList<>();

		Chicken hc = new HomeChicken("Lu","24");
		Chicken yc = new YeChicken("Brice","22");
		

	
				
		liste.add(hc);
		liste.add(yc);

		for (Chicken chicken : liste) {
			System.out.print(chicken.getName()+chicken.getAge());
		
			chicken.eat();
			System.out.println("-------");
		}
	}
}
