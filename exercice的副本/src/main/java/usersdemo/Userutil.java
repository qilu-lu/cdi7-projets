package usersdemo;

public class Userutil {
	public static boolean isCorrectUserName(String userName) {
		boolean isCorrect = true;
		if (userName == null)
			return false;
		if (userName.length() > 25)
			return false;
		char[] unValidChar = { ' ', '\'', '<' };
		for (char ch : unValidChar) {
			if (userName.contains(Character.toString(ch))) {
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}

	public static String validatePassword(String password) {
		String power = "";// 密码的强度,如果返回值为“”那么密码的验证失败。验证成功则返回表示密码的强度。
		if (password == null)
			return power;
		if (password.length() < 6 || password.length() > 18)
			return power;
		String[] correctPart = { "_", "@", "#", "$", "!" };
		String part = "_@#$!";
		for (int i = 0; i < correctPart.length; i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				if (!part.contains(Character.toString(password.charAt(i)))) {
					return power;
				}
			}
		}
		if (isDigit(password) || isLetter(password)) {
			power = "**0000";
		} else if (isDigiAndLetter(password) ) {
			power="***000";
		}

			return power;
	}
	private boolean isDigitAndLetterAndSymbol(String value) {
		for (int i = 0; i < value.length(); i++) {
			if(Character.isDigit(value.CharAt(i))) {
				return false;
			}
		}return true;
	}

private static boolean isDigiAndLetter(String value) {
	for (int i = 0; i < value.length(); i++) {
		if(Character.isLetterOrDigit(value.charAt(i))) {
			return true;
		}
			
	}return false;
}

	private static boolean isDigit(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isContainsSymble(String value) {
		String part = "_@#$!";
		
		for (int i = 0; i < value.length(); i++) {
			if (part.contains(Character.toString(value.charAt(i)))) {
				return true;
			}
		}
		return false;
	}
	}
	
	
