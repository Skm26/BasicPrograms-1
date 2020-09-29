package strings;
//Check if a String contains another String; return true or false
public class ContainsString {
	
	
	public static void main(String[] args) {
		ContainsString c = new ContainsString();
		System.out.println(c.containsString("String to compare with", "String"));
		System.out.println(c.containsString("String to compare with", "1"));
	
}
	
	boolean containsString(String compareString, String myString) {
		
		return ( compareString.contains(myString));
		
		
	}
}
