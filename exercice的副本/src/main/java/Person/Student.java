package Person;

public class Student extends Data {

	public String id;
	public String speciality;

	public Student() {
		super();
	}

	public Student(String name, String sex, String birthday, String id) {
		super(name, sex, birthday);
		setId(id);

	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String setdata() {
		setName(name);
		setSex(sex);
		setBirthday(birthday);
		setId(id);
		setSpeciality(speciality);
		return null;
	}

	@Override
	public String getdata() {
		getName();
		getSex();
		getBirthday();
		getId();
		getSpeciality();
		return name+sex+" "+birthday+id+speciality;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", speciality=" + speciality + "]";
	}

}
