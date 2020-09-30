package strings;

import java.util.Scanner;

//Check if a String contains another String; return message
public class ContainsString {

	private static String haystack = " MyString";

	public static void main(String[] args) {

		ContainsString c = new ContainsString();

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your string: ");
			String needle = input.next();

			System.out.println(c.containsString(haystack, needle));
		}

	}

	public String containsString(String haystack, String needle) {
		String response = "";
		if (ContainsString.haystack.contains(needle))
			response = "String is included.";
		else
			response = "String is not included.";

		return response;
	}

}
