package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {

		String name = "NALAN";
		String reversename = "";
		for (int i = name.length()-1;i>=0;i--) {
			reversename = reversename + name.charAt(i);
		}
		
		if(name.equals(reversename))
		{
			System.out.println("The word "+name+" is a PALANDROME");
		}else
		{
			System.out.println("The word "+name+" is not a not a PALANDROME");
		}
	
		
		
	}
}



/*
 * 
 * package week1.day2.assignments.mandatory;
 * 
 * public class Palindrome { //Build a logic to find the given string is
 * palindrome or not
 * 
 * /* Pseudo Code
 * 
 * OK * a) Declare A String value as"madam" - OK b) Declare another String rev
 * value as "" c) Iterate over the String in reverse order d) Add the char into
 * rev e) Compare the original String with the reversed String, if it is same
 * then print palinDrome
 * 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
 */
