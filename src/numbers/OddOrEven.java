package numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {

	void isOddOrEven(int a) {

		if (a % 2 == 0)
			System.out.println("Number is even");

		else
			System.out.println("number is odd");

	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Input the number: ");
			int a = input.nextInt();
			OddOrEven o = new OddOrEven();
			o.isOddOrEven(a);
		}catch(InputMismatchException e ) {
			System.out.println("Input should be a number");
		}
		
		//if don't use the user's input
		/*OddOrEven o = new OddOrEven();
		o.isOddOrEven(10);*/

	}

}
