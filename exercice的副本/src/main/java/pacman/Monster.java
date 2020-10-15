package pacman;

public class Monster extends Mover implements Obj {

	public Monster() {

	}

	@Override
	public boolean canMove() {
		return true;
	}

	@Override
	public String print() {
		return "X";
	}

}
