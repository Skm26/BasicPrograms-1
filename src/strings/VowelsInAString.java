package strings;

/*import java.text.CharacterIterator;
import java.text.StringCharacterIterator;*/

//Count all vowels in a String

public class VowelsInAString {
	static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) 
	{
		VowelsInAString v = new VowelsInAString();
		System.out.println(v.countVowels("Count the vowels from this String"));
		// System.out.println(v.cVowels("Count the vowels from this String"));
	}

	public int countVowels(String myString) {
		int count = 0;
		for (int i = 0; i < myString.length(); ++i) 
		{
			// char charFromString = myString.charAt(i);

			/*
			 * basic checking if a character is any of the possible vowels if
			 * (charFromString == 'a' || charFromString == 'e'|| charFromString == 'i' ||
			 * charFromString == 'o' || charFromString == 'u')
			 */

			for (int j = 0; j < vowels.length; ++j) 
			{
				if (myString.charAt(i) == vowels[j]) 
				{
					count++;
				}
			}
		}
		return count;
	}

	/*
	 * public int cVowels(String myString) {
	 * 
	 * int count = 0; CharacterIterator c = new StringCharacterIterator(myString);
	 * while (c.current()!=CharacterIterator.DONE) { c.next(); }
	 * 
	 * for (int j = 0; j < vowels.length; ++j) { if (c.next() == vowels[j]) {
	 * count++; } } return count; }
	 */

}
