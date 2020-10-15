package email;

public class Patents implements Email {

	@Override
	public String getToWhom() {
		// TODO Auto-generated method stub
		return "parents";
	}

	@Override
	public String getWhiter() {
		// TODO Auto-generated method stub
		return "Jimmy";
	}

	@Override
	public String getCotent() {
		// TODO Auto-generated method stub
		return "我很好勿惦念";
	}

}
