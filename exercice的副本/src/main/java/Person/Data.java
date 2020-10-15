package Person;

public class Data implements Person {
	public String name;
	public String sex;
	public String birthday;

	

	public Data(String name, String sex, String birthday) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}

	public Data() {
		// TODO Auto-generated constructor stub
	}

	@Override
	
	public String setdata() {
		setName(name);
		setSex(sex);
		setBirthday(birthday);
		return null;
		
	} 

	@Override
	public String getdata() {
		getName();
		getSex();
		getBirthday();
		return name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
