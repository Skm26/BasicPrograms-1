package numbers;

public class SumOfTwoNumbers {
	int x, y;
//create  a method with parameters--> access by object creation
	public int sum(int a, int b) {
		return a + b;

	}
//create method without parameters--> declare x and y  then access method by object 
	int sum2() {
		int s = x + y;
		return s;
	}

	public static void main(String[] args) {
		SumOfTwoNumbers s = new SumOfTwoNumbers();

		System.out.println("Result of method sum is : " + s.sum(2, 4));

		s.x = 1;
		s.y = 1;
		System.out.println( "Result of method sum2 is: " + s.sum2());

	}

}
