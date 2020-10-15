package pacman;

public interface Obj {
	boolean canMove();

	String print();

	public default String println() {
		return print();
	}
}
