package strings;

/*Display the middle character from a String;
 * If Strings's length is even, should return a substring with 2 characters
 * If String's lenght is odd, should return a substring with 1 character
 */

public class MiddleCharacter {

	int indexPosition;
	int lengthOfSubString;
	String myString = "12345678";

	public static void main(String[] args) {
		MiddleCharacter m = new MiddleCharacter();
		System.out.println(m.middleChar("12345678"));
		System.out.println(m.middleChar());
		System.out.println(m.getMiddleChar("12345678"));

	}
	// v1
	public char[] getMiddleChar(String myString) {
		//checks condition and return x or y 
		char[] x = { myString.charAt((0 + (myString.length() - 1)) / 2),
				myString.charAt((0 + (myString.length())) / 2) };
		char[] y = { myString.charAt((0 + (myString.length())) / 2) };
		if (myString.length() % 2 == 0) {
			return x;
		}
		return y;
	}
//v2
	public char[] middleChar(String myString) {

		if (myString.length() % 2 == 0) {
			char[] x = { myString.charAt((0 + (myString.length() - 1)) / 2),
					myString.charAt((0 + (myString.length())) / 2) };
			return x;

		}

		char[] x = { myString.charAt((0 + (myString.length())) / 2) };
		return x;
	}

	
//v3
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
