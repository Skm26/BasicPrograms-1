package strings;

import java.util.Scanner;

//Check if a String contains another String;

public class ContainsString {

	private static String haystack = " MyString";

	public static void main(String[] args) {

		ContainsString c = new ContainsString();

		try (Scanner input = new Scanner(System.in)) 
		{
			System.out.println("Enter your string: ");
			String needle = input.next();
			//System.out.println(c.isStringContained(needle));
			System.out.println(ContainsString.haystack.contains(needle));
		}
	}

	public boolean isStringContained(String needle) {
		if (ContainsString.haystack.contains(needle)) 
		{
			return true;
		}
		return false;
	}//contains already returns true or false so no need to create a method does the same thing
}
