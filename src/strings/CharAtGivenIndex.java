package strings;

//get the character at a given index in the String

public class CharAtGivenIndex {

	String myString = "This is my String";

	public char theCharisAt(int i) {
		
		return myString.toCharArray()[i];

	}
	public static void main(String[] args) {
		CharAtGivenIndex c = new CharAtGivenIndex();
		System.out.println(c.theCharisAt(1));
		
		// java method CharAt
		System.out.println(c.myString.charAt(1));
	}

}
