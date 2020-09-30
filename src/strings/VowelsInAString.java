package strings;

//Count all vowels in a String

public class VowelsInAString {
	static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {
		VowelsInAString v = new VowelsInAString();
		System.out.println(v.countVowels("Count the vowels from this String"));
	}

	public int countVowels(String myString) {
		int count = 0;
		for (int i = 0; i < myString.length(); ++i) {
			char charFromString = myString.charAt(i);

			/*
			 * basic checking if a character is any of the possible vowels if
			 * (charFromString == 'a' || charFromString == 'e'|| charFromString == 'i' ||
			 * charFromString == 'o' || charFromString == 'u')
			 */

			for (int j = 0; j < vowels.length; ++j) {
				if (charFromString == vowels[j])
					count++;
			}
		}

		return count;
	}
}
