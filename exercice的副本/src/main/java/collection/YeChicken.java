package collection;

class YeChicken extends Chicken {
	
	public YeChicken(String name,String age) {
		super(name,age);
	}
	

	public void eat() {
		System.out.println(this.getName() + " love insect");
	}
}