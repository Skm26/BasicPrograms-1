package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Write a Java program to find the common elements between two arrays of integers.

public class CommonElements {
	Integer[] myArray = { 1, 4, 3, 5, 6, 7, 9 };
	Integer[] otherArray = { 1, 2, 3, 6, 5, 7, 7};

	public static void main(String[] args) {

		CommonElements common = new CommonElements();
		System.out.println(common.getCommonElements());
	}

	public Set<Integer> getCommonElements() 
	{
		Set<Integer> setCommonElements = new HashSet<>();
		List<Integer> commonElements = new ArrayList<Integer>();
		/* if returned as list, will not remove any duplicates */

		int commonEl = 0;
		for (int i = 0; i < myArray.length; ++i) 
		{
			for (int j = 0; j < otherArray.length; ++j) 
			{

				if (myArray[i] == (otherArray[j])) 
				{
					commonEl = myArray[i];
					commonElements.add(commonEl);
					for (Integer x : commonElements)
						setCommonElements.add(x);

				}
			}

		}
		return setCommonElements;
	}

	
}
