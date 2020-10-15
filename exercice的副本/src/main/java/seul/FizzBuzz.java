package seul;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 55; i++) {
			System.out.print(fb(i) + ",");
		}
		System.out.println("");
		System.out.println(fb(101));
		System.out.println(fb(303));
		System.out.println(fb(105));
		System.out.println(fb(10101));
	}

	public static String fb(int i) {
		String str = "";
		if (i % 3 == 0) {
			str = "Foo";
		}
		if (i % 5 == 0) {
			str += "Bar";
		}
		if (i % 7 == 0) {
			str += "Qix";
		}
		for (String c : String.valueOf(i).split("")) {
			if ("3".equals(c)) {
				str += "Foo";
			} else if ("5".equals(c)) {
				str += "Bar";
			} else if ("7".equals(c)) {
				str += "Qix";
			} else if ("0".equals(c)) {
				str += "*";
			}
		}

		if (str.isEmpty() || str.replace("*", "").isEmpty()) {
			str = String.valueOf(i).replace("0", "*");
		}

		return str;
	}
}