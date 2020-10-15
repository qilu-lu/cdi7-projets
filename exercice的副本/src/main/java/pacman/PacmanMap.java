package pacman;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PacmanMap {
	Parcelle[][] objets = new Parcelle[10][10];
	Set<Obj> h = new HashSet<Obj>();

	public PacmanMap() {
		for (int i = 0; i < objets.length; i++) {
			for (int j = 0; j < objets[i].length; j++) {
				objets[i][j] = new Parcelle();
			}
		}
	}

	public void print() {
		for (int i = 0; i < objets.length; i++) {
			for (int j = 0; j < objets[i].length; j++) {
				System.out.print(objets[i][j].print());
			}
			System.out.println();
		}

	}

	public void movePacman(Direction direction) {
		h.clear();
		for (int i = 0; i < objets.length; i++) {
			for (int j = 0; j < objets[i].length; j++) {

				if (objets[i][j].containsObject(PacMan.class)) {
					if (direction == Direction.AHEAD) {
						if (i > 0) {
							if (X(i, j, i - 1, j)) {
								break;
							}
						}
					}
					if (direction == Direction.BEHIND) {
						if (i < objets.length - 1) {
							if (X(i, j, i + 1, j)) {
								break;
							}
						}
					}
					if (direction == Direction.LEFT) {
						if (j > 0) {
							if (X(i, j, i, j - 1)) {
								break;
							}
						}
					}
					if (direction == Direction.RIGHT) {
						if (j < objets[i].length - 1) {
							if (X(i, j, i, j + 1)) {
								break;
							}
						}

					}

				}
			}
		}

	}

	private void gagner() {
		Set<Obj> w = new HashSet<Obj>();

		for (int i = 0; i < objets.length; i++) {
			for (int j = 0; j < objets[i].length; j++) {
				Pois b = objets[i][j].getObject(Pois.class);

				if (objets[i][j].containsObject(Pois.class)) {
					w.add(b);
				}
			}
		}
		if (w.isEmpty()) {
			System.out.println("gagner!");
		}
	}

	private boolean X(int i, int j, int i1, int j1) {

		boolean shouldBreak = false;
		if (!objets[i1][j1].containsObject(Mur.class)) {
			Monster m = objets[i1][j1].getObject(Monster.class);

			if (m != null && !h.contains(m)) {
				// ?quel index
				objets[i1][j1].getObjets().clear();
				objets[i1][j1].getObjets().add(m);
				objets[i][j].getObjets().clear();
				System.out.println("game over");

				h.add(m);
				shouldBreak = true;
			}
			PacMan p = objets[i][j].getObject(PacMan.class);
			if (objets[i1][j1].containsObject(Pois.class)) {
				if (!h.contains(p)) {
					objets[i1][j1].getObjets().clear();
					objets[i1][j1].getObjets().add(p);
					objets[i][j].getObjets().clear();
					h.add(p);
					shouldBreak = true;

				}
				// shouldBreak = true;

			}

			if (objets[i1][j1].isEmpty()) {
				if (!h.contains(p)) {
					objets[i][j].getObjets().clear();
					objets[i1][j1].getObjets().add(p);
					//
					h.add(p);
					shouldBreak = true;
				}
				// shouldBreak = true;
			}
			shouldBreak = true;
		} else {
			PacMan p = objets[i][j].getObject(PacMan.class);
			if (!h.contains(p)) {
				objets[i][j].getObjets().clear();
				objets[i][j].getObjets().add(p);
				h.add(p);
				shouldBreak = true;
			}
		}
		return shouldBreak;
	}

	public void moveMonster() {
		h.clear();
		for (int i = 0; i < objets.length; i++) {
			for (int j = 0; j < objets[i].length; j++) {
				if (objets[i][j].containsObject(Monster.class)) {
					move(i, j);
					continue;
				}
			}
		}
	}

	private void move(int i, int j) {
		Direction direction = Direction.values()[(int) (Math.random() * 4)];
		if (direction == Direction.AHEAD) {
			if (i > 0) {
				if (Y(i, j, i - 1, j)) {
					return;
				}
			}
		}
		if (direction == Direction.BEHIND) {
			if (i < objets.length - 1) {
				if (Y(i, j, i + 1, j)) {
					return;
				}
			}
		}
		if (direction == Direction.LEFT) {
			if (j > 0) {
				if (Y(i, j, i, j - 1)) {
					return;
				}
			}
		}
		if (direction == Direction.RIGHT) {
			if (j < objets[i].length - 1) {

				if (Y(i, j, i, j + 1)) {
					return;
				}
			}
		}
		move(i, j);
	}

	private boolean Y(int i, int j, int i1, int j1) {
		boolean shouldBreak1 = false;

		if ((objets[i1][j1].containsObject(PacMan.class))) {
			PacMan p = objets[i1][j1].getObject(PacMan.class);
			Monster m = objets[i][j].getObject(Monster.class);
			if (p != null && !h.contains(p) && !h.contains(m)) {
				System.out.println("PacMan mort");
				System.exit(0);
				objets[i1][j1].getObjets().add(m);
				objets[i][j].getObjets().remove(m);
				h.add(p);
				h.add(m);
				return true;
			}
		}

		if (!objets[i1][j1].containsObject(Mur.class) && !objets[i1][j1].containsObject(Monster.class)) {

			Monster m = objets[i][j].getObject(Monster.class);
			if (!h.contains(m)) {
				if (objets[i][j].containsObject(Pois.class)) {

					objets[i1][j1].getObjets().add(m);
					objets[i][j].getObjets().remove(m);
					return true;
				} else {

					objets[i1][j1].getObjets().add(m);
					objets[i][j].getObjets().remove(m);
					return true;
				}
			}
		}
		return shouldBreak1;

	}

	public void nextTurn() {
		moveMonster();
	}
}
