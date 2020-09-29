package strings;

//Count all vowels in a String

public class VowelsInAString {

	public static void main(String[] args) {
		VowelsInAString v = new VowelsInAString();
		System.out.println(v.countVowels("Count the vowels from this String"));
	}

	public int countVowels(String myString) {

		int count = 0;
		for (int i = 0; i <= myString.length() - 1; i++) {

			if (myString.charAt(i) == 'a' || myString.charAt(i) == 'e' ||myString.charAt(i) == 'i' || myString.charAt(i) == 'o'
					|| myString.charAt(i) == 'u')

				count++;

		}
		return count;
	}
}
