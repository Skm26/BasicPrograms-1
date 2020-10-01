package strings;

public class WordsInAString 
{
	public static void main(String[] args) 
	{
		WordsInAString w = new WordsInAString();
		System.out.println(w.countWords("   A a   a  abc 4 "));

	}

	public int countWords(String myString) 
	{
		int words = 0;
		char space = ' ';
		for (int i = 0; i < myString.length(); ++i) 
		{
			if ((i == 0 && myString.charAt(0) != space)|| 
					(i > 0 && myString.charAt(i) == space && myString.charAt(i-1) != space)) 
			{
				words++;
				}

		}
		return words;
	}

}
