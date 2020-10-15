package seul;

public class Ball {

	public String ballType;

	@Override
	public String toString() {
		return "Ball [ballType=" + ballType + "]";
	}

	public Ball(String aSuper) {
		this.ballType = aSuper;
	}

	public Ball() {
		this.ballType = "regular";
	}

	public static void main(String[] args) {
		Ball ball1 = new Ball();

		Ball ball2 = new Ball("super");
		System.out.println(ball1.ballType);

	}
}