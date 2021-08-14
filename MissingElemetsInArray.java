package week1.day2.assignments;

import java.util.Arrays;

public class MissingElemetsInArray {

	public static void main(String[] args) {

		int[] arr = { 7, 5, 3, 1, 4, 6, 8 };

		Arrays.sort(arr);

		for (int i = 1; i <= arr.length; i++) {
			if (arr[i - 1] != i) {
				System.out.println("The missing number in the series is: " + i);
				break;

			}

		}
	}

}
