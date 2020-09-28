package numbers;

import java.util.Scanner;

class LeapYear {

	int year;

	public void leapYear() {

		for (year = 1995; year <= 2020; year++) {
			if (year % 4 == 0)
				System.out.println(year + " Leap Year");
			else
				System.out.println(year);

		}
	}

	public static void main(String[] args) {
		LeapYear y = new LeapYear();
		y.leapYear();

		LeapYear2 y2 = new LeapYear2();
		y2.leapYear2();
	}
}

class LeapYear2 {

	Scanner input = new Scanner(System.in);

	public void leapYear2() {
		System.out.println("Enter the year: ");
		int enterYear = input.nextInt();
		if (enterYear % 4 == 0 && enterYear % 100 != 0 || enterYear % 400 == 0)
			System.out.println(enterYear + " is leap year");
		else
			System.out.println(enterYear + " is not leap year");
	}
}
