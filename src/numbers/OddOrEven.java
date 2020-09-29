package numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {

	public boolean isOddOrEven(int a) {
		/*
		 * return true if condition is true;
		 * return (a%2==0);
		 * */

		if (a % 2 == 0)
			return true;
		// return false is executed only if first condition is not true; 
			return false;

	}

	public static void main(String[] args) {
		/*
		 * try (Scanner input = new Scanner(System.in)) {
		 * System.out.println("Input the number: "); int a = input.nextInt(); OddOrEven
		 * o = new OddOrEven(); o.isOddOrEven(a); }catch(InputMismatchException e ) {
		 * System.out.println("Input should be a number"); }
		 */

		// if don't use the user's input
		OddOrEven o = new OddOrEven();
		System.out.println(o.isOddOrEven(10));

	}

}
