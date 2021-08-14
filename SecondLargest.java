package week1.day2.assignments;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };
		System.out.println("Unsorted array: " + Arrays.toString(data));
		Arrays.sort(data);
		System.out.println("Sorted array: " + Arrays.toString(data));
		int size = data.length;
		System.out.println("Array size: " + size);
		int output = data[size - 2];
		System.out.println("Second largest number in the array is: " + output);

	}

}
