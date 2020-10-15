package collection;

class HomeChicken extends Chicken {
	public HomeChicken(String name,String age) {
		super(name,age);
		
	}

	public void eat() {
		System.out.println(this.getName() + " love rice");
	}
	
}