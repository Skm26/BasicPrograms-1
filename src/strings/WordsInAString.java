package strings;

public class WordsInAString {
public static void main(String[] args) {
	WordsInAString w = new WordsInAString();
	System.out.println(w.countWords("This is a string to count, should have 10 words."));
	
}

public int countWords(String myString) {
	int count = 0;
	
	for (int i =0; i<=myString.length()-1; i++) {
	
				if((i>0) && myString.charAt(i) == ' ' && myString.charAt(i)-1 !=' ' && myString.charAt(i)+1 != ' ' 
				|| (i==0) && myString.charAt(0)!= ' ')  {                                                      	
			count ++;
		}
	}return count;
}
}
