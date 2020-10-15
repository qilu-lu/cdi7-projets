package pacman;

public class PacMan extends Mover implements Obj {

	public PacMan() {
	}

	public PacMan(String a) {
	}

	@Override
	public boolean canMove() {
		return true;
	}

	@Override
	public String print() {
		return "V";
	}

}
