package week1.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str1 = "Welcome to Greater Chennai Corporation";
		int count = 0;
		char CharOcc = 'c';
		char[] charArr = str1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == CharOcc) {
				count++;

			}

		}
		System.out.println("# of occurances of character "+CharOcc+ " is: "+ count);

	}

}
