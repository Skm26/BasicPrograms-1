package strings;

/*Display the middle character from a String;
 * If Strings's length is even, should return a substring with 2 characters
 * If String's lenght is odd, should return a substring with 1 character
 */

public class MiddleCharacter {

	int indexPosition;
	int lengthOfSubString;
	String myString = "123456788990";

	public static void main(String[] args) {
		MiddleCharacter m = new MiddleCharacter();
		System.out.println(m.middleChar("123456788990"));
		System.out.println(m.middleChar());

	}

	public char middleChar(String myString) {
		char[] c = new char[myString.length()];
		for (int i = 0; i <= c.length - 1; i++) {
			c[i] = myString.charAt(i);
			if (c.length % 2 == 0) {

				return myString.charAt((0 + (myString.length() - 1)) / 2); // will return 6

			}

		}
		return myString.charAt((0 + (myString.length() - 1)) / 2);
	}

	public String middleChar() {

		// check if String has odd or even length;

		if (myString.length() % 2 == 0) {

			// return substring with length 2 if String is even/ length 1 if String is odd

			lengthOfSubString = 2;
			indexPosition = (myString.length() / 2) - 1;
			// substring will include begin index and exclude lastindex;
			return myString.substring(indexPosition, indexPosition + lengthOfSubString); // will return 67
		}

		lengthOfSubString = 1;
		indexPosition = myString.length() / 2;
		return myString.substring(indexPosition, indexPosition + lengthOfSubString);
	}
}
