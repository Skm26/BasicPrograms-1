package strings;

/* Method to check whether a string is a valid password
 * Password rules:
 * A password must have at least ten characters.
 * A password consists of only letters and digits.
 * A password must contain at least two digits.*/

public class ValidPasswordCheck {
	String password = "aaaaaaaaaaaa11";
	static String passwordNotCreated = "Could not create passoword";

	public static void main(String[] args) {
		ValidPasswordCheck v = new ValidPasswordCheck();

		System.out.println("Password: " + v.passwordValidator());
		System.out.println("Password:" + v.passwordCheck());

	}

	// v1
	public String passwordCheck() {

		for (int i = 0; i < password.length(); ++i) {
			if (password.length() >= 10
					&& Character.isLetter(password.charAt(i))
					&& noWhiteSpaces() == true
					&& noSpecialChar() == true)

				if (containsAtLeastTwoNumbers() == true)

					return password;
		}
		return passwordNotCreated;
	}

	// v2
	public String passwordValidator() {
		if (lengthPassword() == true 
				&& containsLetters() == true 
				&& containsDigit() == true
				&& containsAtLeastTwoNumbers() == true
				&& noWhiteSpaces() == true
				&& noSpecialChar() ==true) {
			return password;
		}

		return passwordNotCreated;

	}

	public boolean lengthPassword() {
		return password.length() >= 10;
	}

	public boolean containsLetters() {
		for (int i = 0; i < password.length(); ++i) {
			if ((Character.isLetter(password.charAt(i))))
				return true;

		}
		return false;
	}

	public boolean containsDigit() {
		for (int i = 0; i < password.length(); ++i) {
			if ((Character.isDigit(password.charAt(i))))
				return true;
		}
		return false;
	}

	public boolean containsAtLeastTwoNumbers() {

		int digitCount = 0;
		for (int i = 0; i < password.length(); ++i) {

			char passChar = password.charAt(i);

			if (Character.isDigit(passChar))

				digitCount++;
		}
		if (digitCount >= 2)
			return true;
		return false;

	}

	boolean noWhiteSpaces() {
		for (int i = 0; i < password.length(); ++i) {
			if ((Character.isWhitespace(password.charAt(i))))
				return false;
		}
		return true;
	}

	boolean noSpecialChar() {
		String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
		for (int i = 0; i < password.length(); ++i) {
			if (specialChars.contains(String.valueOf(password.charAt(i))))
				return false;
		}
		return true;
	}

}
