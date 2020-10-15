package duotai;

public class Singer extends Actor{

	public Singer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
 @Override
public void performs() {
	// TODO Auto-generated method stub
	System.out.println("Singer"+getName()+"is singing");
}
}
