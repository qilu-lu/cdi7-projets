package duotai;

public abstract class Actor {
	private String name;

	public Actor() {
	}

	public Actor(String name) {
		
		setName(name);
	}
	public void performs() {
		System.out.println("actor"+name+"is performing");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
