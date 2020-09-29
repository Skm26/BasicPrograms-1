package strings;

/* Method to check whether a string is a valid password
 * Password rules:
 * A password must have at least ten characters.
 * A password consists of only letters and digits.
 * A password must contain at least two digits.*/

public class ValidPasswordCheck {
	String password = "password11";
	static String passwordNotCreated = "Could not create passoword";

	public static void main(String[] args) {
		ValidPasswordCheck v = new ValidPasswordCheck();

		System.out.println("Password created: " + v.passwordCheck());

	}

	public String passwordCheck() {
		if (lengthPassword() == true && containsLetters() ==true && containsDigit() == true) {
			return password;
		}

		return passwordNotCreated;

	}

	public boolean lengthPassword() {
		return password.length() >= 10;
	}

	public boolean containsLetters() {
		for (int i = 0; i <= password.length() - 1; i++) {
			if ((Character.isLetter(password.charAt(i)) == true))
				return true;

		}
		return false;
	}

	public boolean containsDigit() {
		for (int i = 0; i <= password.length() - 1; i++) {
			if ((Character.isDigit(password.charAt(i)) == true))
				return true;
		}
		return false;
	}

/*	public boolean containsAtLeastTwoNumbers() {
		
		//not defined correctly yet
		int lettercount = 0;
		int digitCount = 0;
		for (int i = 0; i <= password.length() - 1; i++) {

			char d = password.charAt(i);
			digitCount++;
			if (containsDigit() == true) {

				digitCount++;
			} else if (containsLetters() == true) {
				lettercount++;
			} else {
				return false;
			}

		}
		if (digitCount >= 2)
			return true;
		return false;

	}*/
}
