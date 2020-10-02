package arrays;

import java.util.Arrays;

//Insert an element into an array at a specified position
public class ElementInsertion {

	public static void main(String[] args) {

		int[] myArray = { 1, 2, 3, 4 };
		ElementInsertion e = new ElementInsertion();
		try 
		{
			myArray = e.insertElement(5, 1, myArray);
			System.out.println(Arrays.toString(myArray));
		} 
		catch (ArrayIndexOutOfBoundsException exception) 
		{
			System.out.println(" Position is out of bounds");
		}

	}

	public int[] insertElement(int elem, int position, int[] myArray) throws ArrayIndexOutOfBoundsException {
		int[] newArray = new int[myArray.length + 1];
		for (int i = 0; i < myArray.length + 1; ++i) 
		{
			if (i < position) 
			{
				newArray[i] = myArray[i];
			}
			else if (i == position) 
			{
				newArray[i] = elem;
			} 
			else if (i > position) {
				newArray[i] = myArray[i - 1];
			} 
			else 
			{

				throw new ArrayIndexOutOfBoundsException();
			}

		}
		return newArray;

	}

}