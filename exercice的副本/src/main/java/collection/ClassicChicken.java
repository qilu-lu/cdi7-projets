package collection;

public class ClassicChicken extends Chicken {

	public ClassicChicken(String name) {
		super(name);
	}

	public void eat() {
		System.out.println(this.getName() + " love rice");
	}

}
