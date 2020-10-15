package pacman;

public class Pois implements Obj {

	public Pois() {

	}

	@Override
	public boolean canMove() {
		return false;
	}

	@Override
	public String print() {
		return "*";
	}
}
