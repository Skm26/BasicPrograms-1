package numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {
	// input the value from user
	static Scanner input = new Scanner(System.in);
	String tryAgain;
	String answer;

	public static void main(String[] args) {
		// create object
		FizzBuzz FB = new FizzBuzz();
		// method access by object
		FB.tryFizzBuzz();
	}

	public void tryFizzBuzz() {
		// execute the following statements while condition is true
		boolean conditiontoStart = true;
		while (conditiontoStart == true) {
			System.out.println("Want to see FizzBuzz?");
			try {
				answer = input.next();
				if (answer.equalsIgnoreCase("yes")) {
					System.out.println("Starting..");
				} else if (answer.equalsIgnoreCase("no")) {
					break; // exit if answer is no after execute finally
				} else {
					System.out.println("don't understand input");
					break; // exit if answer is not yes or no after execute finally
				}

			} finally {
				System.out.println("Thank you");// execute for whatever input while condition is true

			}

			do // execute if answer==yes
			{
				/*
				 * answer = input.nextLine(); if (answer.equals("yes")) {
				 */

				System.out.println("Input the number: ");
				int n = GetAnInteger();// see the method

				for (int i = 0; i <= n; i++) {
					if (i % 3 == 0 && i % 5 == 0)
						System.out.print("FizzBuzz");
					else if (i % 5 == 0)
						System.out.print("Buzz");
					else if (i % 3 == 0)
						System.out.println("Fizz");

					else
						System.out.print(i);

					System.out.println(" ");
				}

				/*
				 * } else if (answer.equals("no")) { System.out.println("quitting...");
				 */

				System.out.println("Want to try again? Yes or No?");
				tryAgain = input.next();
			} while (tryAgain.equalsIgnoreCase("yes"));// condition to execute again the do while loop; will execute
														// once then checks for while condition
//}while(answer.equalsIgnoreCase("yes"));
		}
	}

	private static int GetAnInteger() {// get the integer value to check from user;
		
		while (true) // always true
		{
			try {
				return input.nextInt();
			} catch (InputMismatchException e) {//will throw exception if input is not integer but not exit

				input.next();
				System.out.println("Not correct input");
				System.out.println("Try again");
			}
		}
	}
}
