package monstres_array;

public class Main {
	public static void main(String[] args) {
		ArmyLC army = new ArmyLC();

		for (int i = 0; i < 60; i++) {
			Monster Pikachu = new Monster("Pikachu" + i);
			army.add(Pikachu);
		}

		ArmyLC.display(army);
	}

}
