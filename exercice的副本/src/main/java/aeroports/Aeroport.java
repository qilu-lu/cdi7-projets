package aeroports;

public class Aeroport {
	String aeroportName;
	Integer age;

	public Aeroport(String name, int age) {
		this.aeroportName = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Aeroport [aeroportName=" + aeroportName + ", age=" + age + "]";
	}

}
