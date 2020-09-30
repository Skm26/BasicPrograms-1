package numbers;

public class DivideBy {
	public static void main(String[] args) {
		
		DivideBy d = new DivideBy();
		d.divided(35);
		
	}
	
	void divided(int a) {
		if(a % 3 == 0 && a % 5 == 0) 
			System.out.println("Divided by 3&5");
		
		else if (a % 3 == 0) 
			System.out.println("Divided by 3");
		else if(a % 5 == 0)
			System.out.println("Divided by 5");
		else
			System.out.println("Not divide by 3 or 5");
			
		
	}

}
