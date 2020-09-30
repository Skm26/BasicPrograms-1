package strings;

public class WordsInAString {
	public static void main(String[] args) {
		WordsInAString w = new WordsInAString();
		System.out.println(w.countWords("   A a   a  abc 4 "));

	}

	public int countWords(String myString) {

		int words = 0;
		char space = ' ';
		char[] chFromString = new char[myString.length()];
		for (int i = 0; i < myString.length(); ++i) {
			chFromString[i] = myString.charAt(i);
			if ((i == 0 && chFromString[0] != space)
					|| (i > 0 && chFromString[i] == space && chFromString[i - 1] != space))

				words++;

		}
		return words;
	}

}
