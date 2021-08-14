package week1.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		String str = "!@ Welcome to TestLeaf Selenium 10th course %*";
		int letter = 0, digit = 0, space = 0, spclSymb = 0;

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				letter++;
			} else if (Character.isDigit(charArray[i])) {
				digit++;
			} else if (Character.isSpaceChar(charArray[i])) {
				space++;
			} else {
				spclSymb++;
			}
		}
		System.out.println("Letter is " + letter);
		System.out.println("Digit is " + digit);
		System.out.println("Space is " + space);
		System.out.println("Special Character is " + spclSymb);

	}

}