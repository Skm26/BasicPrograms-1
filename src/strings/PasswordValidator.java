package strings;

/* Method to check whether a string is a valid password
 * Password rules:
 * A password must have at least ten characters.
 * A password consists of only letters and digits.
 * A password must contain at least two digits.*/

public class PasswordValidator 
{

	String password = "MyPassword11";

	public static void main(String[] args) 
	{

		PasswordValidator validator = new PasswordValidator();
		try 
		{ 
			validator.validate();
			System.out.println("Great, password is ok.");
		} 
		catch (WrongPasswordFormatException e) 
		{
			System.out.println(e.getMessage());
		}
	}

	public void validate() throws WrongPasswordFormatException 
	{

		if (!lengthPassword()) 
		{
			throw new WrongPasswordFormatException("Length is invalid");
		}

		if (!containsLetters()) 
		{
			throw new WrongPasswordFormatException("Password should contain letters too.");
		}

		if (!containsDigit()) 
		{
			throw new WrongPasswordFormatException("Password should contain digits too.");
		}

		if (!containsAtLeastTwoNumbers()) 
		{
			throw new WrongPasswordFormatException("Password should contain at least two digits.");
		}

		if (!doesNotContainSpecialChar()) 
		{
			throw new WrongPasswordFormatException("Password should not contain any special characters.");
		}

		if (!doesNotContainWhiteSpaces()) 
		{
			
			throw new WrongPasswordFormatException("Password should not contain white spaces.");
		}

	}

	public boolean lengthPassword() 
	{
		return password.length() >= 10;
	}

	public boolean containsLetters() 
	{
		for (int i = 0; i < password.length(); ++i)
		{
			if ((Character.isLetter(password.charAt(i))))
				return true;

		}
		return false;
	}

	public boolean containsDigit() 
	{
		for (int i = 0; i < password.length(); ++i) 
		{
			if ((Character.isDigit(password.charAt(i)))) 
			{
				return true;
				}
		}
		return false;
	}

	public boolean containsAtLeastTwoNumbers() 
	{
		int digitCount = 0;
		for (int i = 0; i < password.length(); ++i) 
		{
			if (Character.isDigit(password.charAt(i))) 
			{
				digitCount++;
				}
		}
		
		if (digitCount >= 2) 
		{
			return true;
			}
		return false;

	}

	boolean doesNotContainWhiteSpaces() 
	{
		for (int i = 0; i < password.length(); ++i) 
		{
			if ((Character.isWhitespace(password.charAt(i)))) 
			{
				return false;
				}
		}
		return true;
	}

	boolean doesNotContainSpecialChar() 
	{
		String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
		for (int i = 0; i < password.length(); ++i) 
		{
			if (specialChars.contains(String.valueOf(password.charAt(i)))) 
			{
				return false;
				}
		}
		return true;
	}

	public class WrongPasswordFormatException extends Exception 
	{

		public WrongPasswordFormatException(String message) 
		{
			super ("Invalid password: " + message);
		}

	}

}
