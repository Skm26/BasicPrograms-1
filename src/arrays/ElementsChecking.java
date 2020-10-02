package arrays;

//Write a Java program to check if an array of integers contains two specified elements 65 and 77.

public class ElementsChecking {

	int[] myArray = { 65, 65, 77, 77, 77, 77 };

	public static void main(String[] args) 
	{
		ElementsChecking contains = new ElementsChecking();
		System.out.println(contains.containsElement(65));
		
	}

	public boolean containsElement(int x) 
	{
		for (int i = 0; i < myArray.length; ++i) 
		{

			if (myArray[i] == x) 
			{
				return true;

			}
		}
		return false;
	}

}
