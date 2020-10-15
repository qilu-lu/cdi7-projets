package collection;

public abstract class Chicken {
	private String name;
	private String age;

	public Chicken() {
	}

	public Chicken(String name) {
		super();
		this.name = name;
	}

	public Chicken(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void eat();

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public final void xxx() {

	}
}