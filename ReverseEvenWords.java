package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "Learning can never be ended";
		String[] splitChars = str.split(" ");
		for(int i=0 ; i<splitChars.length ; i++) {
			if(i%2 !=0) {
				char chararray[] = splitChars[i].toCharArray();
				for(int j = chararray.length-1 ; j >= 0 ;j--) {
				System.out.print(chararray[j]);
				}
				System.out.print(" ");
			}
			else { 
				System.out.print(splitChars[i]);
				System.out.print(" ");
			}
		}

	}

}
