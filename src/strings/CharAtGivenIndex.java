package strings;

//get the character at a given index in the String

public class CharAtGivenIndex {

	String myString = "This is my String";

	public boolean isCharAtGivenIndex(int i) {

		return (i < myString.length());

	}

	public static void main(String[] args) {
		CharAtGivenIndex c = new CharAtGivenIndex();

		System.out.println(c.isCharAtGivenIndex(100));

		// java method CharAt
		// System.out.println(c.myString.charAt(100));
		
	}

}
