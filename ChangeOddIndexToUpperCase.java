package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "this is a case conversion program";
		char[] strarray = str.toCharArray();
		for(int i=0 ; i<str.length() ; i++) {
			if(i%2 ==0) {
				char uppercase = Character.toUpperCase(strarray[i]);
				System.out.print(uppercase);
			}
			else { 
				System.out.print(strarray[i]);
			}
		}
	}
}