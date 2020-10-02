package strings;

//get the character at a given index in the String

public class CharAtGivenIndex {

	String myString = "This is my String";

	public char getCharAtIndex(int i) throws StringIndexOutOfBoundsException {

	if (i <myString.length()) 
	{
		return myString.toCharArray()[i];
	}
		throw new StringIndexOutOfBoundsException(); 
	}
	
	

	public static void main(String[] args) {
		CharAtGivenIndex c = new CharAtGivenIndex();
		try 
		{
			System.out.println(c.getCharAtIndex(100));
		}
		catch (StringIndexOutOfBoundsException exception) 
		{
			System.out.println("Out of bounds");
		}
	}

}
