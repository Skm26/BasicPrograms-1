package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemoval {

	Integer[] myArray = { 1, 4, 3, 5, 6, 7, 9, 9, 9, 7 };

	public static void main(String[] args) 
	{
		String[] otherArray = { "a", "b", "c", "c", "b" };
		
		Set<String> noDuplicates = new HashSet<>(Arrays.asList(otherArray));
		System.out.println(noDuplicates);
		
		
		DuplicateRemoval remove = new DuplicateRemoval();
		System.out.println(remove.removeDuplicate());

	}

	public Set<Integer> removeDuplicate() 
	{
		// a HashSet will contain only unique elements, while List accepts duplicates
		
		Set<Integer> noDuplicates = new HashSet<>(Arrays.asList(myArray));
		return noDuplicates;
	}
}