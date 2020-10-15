package menagerie.test;

import menagerie.Animal;
import menagerie.Zoo;

public class Lanceur {
public static void main(String[] args) {
	
	Animal alex=new Animal("Alex", "Lion", 500);
	Animal gloria=new Animal("Gloria", "Hippo", 900);
	Animal Dizzy=new Animal("Dizzy", "Lion", 1000);
	Zoo NewYork=new Zoo("NewYork",3);
	NewYork.addAnimal(gloria);
	NewYork.addAnimal(alex);
	NewYork.addAnimal(Dizzy);
	NewYork.printAll(NewYork.cage);
	
}


}
