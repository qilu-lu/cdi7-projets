package duotai;

public class Dancer extends Actor {

	public Dancer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dancer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void performs() {
		// TODO Auto-generated method stub
		System.out.println("Danser"+getName()+"is dansing");
	}

}
