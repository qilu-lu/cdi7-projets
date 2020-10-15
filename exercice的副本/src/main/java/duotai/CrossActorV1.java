package duotai;

public class CrossActorV1 extends Actor {

	public CrossActorV1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CrossActorV1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
@Override
public void performs() {
	System.out.println(getName()+"new hello ");
}
}
