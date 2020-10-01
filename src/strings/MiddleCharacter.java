package strings;

/*
 * Display the middle character from a String;
 * If Strings's length is even, should return a substring with 2 characters
 * If String's lenght is odd, should return a substring with 1 character
 */

public class MiddleCharacter {

	int indexPosition;
	int lengthOfSubString;
	

	public static void main(String[] args) {
		MiddleCharacter m = new MiddleCharacter();
		System.out.println(m.getMiddleChar("12345678"));
		System.out.println(m.getMiddleChar2("12345678"));
		System.out.println(m.getMiddleChar3("12345678"));

	}

	// v1 - checks condition and return x or y

	public char[] getMiddleChar(String myString) 
	{
		char[] x = { myString.charAt((0 + (myString.length() - 1)) / 2), myString.charAt((0 + (myString.length())) / 2) };
		char[] y = { myString.charAt((0 + (myString.length())) / 2) };
		if (myString.length() % 2 == 0) 
		{
			return x;
		}
		return y;
	}

	// v2 - return x based on condition
	public char[] getMiddleChar2(String myString) 
	{
		if (myString.length() % 2 == 0) 
		{
			char[] x = { myString.charAt((0 + (myString.length() - 1)) / 2), myString.charAt((0 + (myString.length())) / 2) };
			return x;
		}
		char[] x = { myString.charAt((0 + (myString.length())) / 2) };
		return x;
	}

	/*
	 * v3 - check if String has odd or even length; returns a substring with length
	 * 1 if is even, or 2 if is odd; substring will include begin index and exclude
	 * lastindex;
	 */
	
	public String getMiddleChar3(String myString) 
	{
		if (myString.length() % 2 == 0) 
		{
			lengthOfSubString = 2;
			indexPosition = (myString.length() / 2) - 1;
			return myString.substring(indexPosition, indexPosition + lengthOfSubString);
		}
		lengthOfSubString = 1;
		indexPosition = myString.length() / 2;
		return myString.substring(indexPosition, indexPosition + lengthOfSubString);
	}
}
