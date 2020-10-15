package email;

public class Emaillmpl {
	private Email email1 ;

	public void print() {
		String towhom = email1.getToWhom();
		String whiter = email1.getWhiter();
		String Content=email1.getCotent();
		System.out.println("亲爱的" + towhom);
		System.out.println(Content);
		System.out.println(whiter);
	}

	public Email getEmail1() {
		return email1;
	}

	public void setEmail1(Email email1) {
		this.email1 = email1;
	}

}
