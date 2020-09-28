package numbers;

import java.util.ArrayList;
import java.util.List;

public class AllEvenNumbers {

	public void evenNumbers() {

		for (int i = 0; i <= 100; i++)
			if (i % 2 == 0)
				System.out.println(i);

	}
	
	public void evenNumbersList() {
		List<Integer> li = new ArrayList<Integer>();
		
		for (int i=0; i<=100; i++ ){
			li.add(i);
			if (i%2==0) {
				System.out.println(li.get(i));
			}
		}
	}

	public static void main(String[] args) {
		AllEvenNumbers num = new AllEvenNumbers();
		num.evenNumbers();
		System.out.println("-------------------");
		num.evenNumbersList();
	}

}
