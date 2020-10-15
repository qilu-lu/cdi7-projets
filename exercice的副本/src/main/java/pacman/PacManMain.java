package pacman;

import java.util.Scanner;


public class PacManMain {

	public static void main(String[] args) {
		PacmanMap map = new PacmanMap();
		// Mur mur=new Mur();

		// map.objets[1][1]=new Pois();
		map.objets[2][1].getObjets().add(new Pois());
		map.objets[2][8].getObjets().add(new PacMan());
		// map.objets[4][1].getObjets().add(new Pois());
		// map.objets[2][1]=new Pois();
		map.objets[5][2].getObjets().add(new Monster());
		map.objets[5][1].getObjets().add(new Monster());
		map.objets[5][3].getObjets().add(new Monster());
		map.objets[3][4].getObjets().add(new Mur());
		map.objets[4][5].getObjets().add(new Mur());
		map.objets[4][6].getObjets().add(new Mur());
		map.objets[6][4].getObjets().add(new Mur());
		for (int i = 1; i < map.objets[0].length - 1; i++) {
			map.objets[1][i].getObjets().add(new Pois());
			map.objets[map.objets[0].length - 2][i].getObjets().add(new Pois());
		}

		for (int i = 0; i < map.objets[0].length; i++) {
			map.objets[0][i].getObjets().add(new Mur());
			map.objets[map.objets.length - 1][i].getObjets().add(new Mur());
		}
		for (int i = 0; i < map.objets.length; i++) {
			map.objets[i][0].getObjets().add(new Mur());
			map.objets[i][map.objets.length - 1].getObjets().add(new Mur());
		}

		for (int i = 0; i < map.objets.length; i++) {
			for (int j = 0; j < map.objets[i].length; j++) {
				if (map.objets[i][j].isEmpty()) {
					map.objets[i][j].getObjets().add(new Pois());
				}

			}
		}

		for (int j = 0; j < args.length; j++) {
			map.objets[4][j].getObjets().add(new Pois());
		}

		map.print();

		/*
		 * map.movePacman(Direction.RIGHT); map.print();
		 * map.movePacman(Direction.AHEAD); map.print(); map.movePacman(Direction.LEFT);
		 * map.print();
		 */
		// map.movePacman(Direction.BEHIND);
		// map.print();

		try (Scanner input = new Scanner(System.in)) {
			while (true) {
				Direction direction = null;
				String choice = input.next();
				switch (choice.toLowerCase()) {
				case "w":
					direction = (Direction.AHEAD);
					break;
				case "s":
					direction = (Direction.BEHIND);
					break;
				case "a":
					direction = (Direction.LEFT);
					break;
				case "d":
					direction = (Direction.RIGHT);
					break;
				}
				if (direction != null) {
					map.movePacman(direction);
					map.nextTurn();
				}
				map.print();
			}
		}
		// map.print();
		// map.moveMonster(Direction.BEHIND);
		// map.print();
	}
}
