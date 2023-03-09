package day04_project;

import java.util.Arrays;

public class Ex_07_OddEvenArray {

	public static void main(String[] args) {

		int arr[] = { 10, 25, 32, 54, 23, 16, 27, 61 };

		int oddArray[] = new int[arr.length];
		int evenArray[] = new int[arr.length];
		Arrays.sort(arr);
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				oddArray[index] = arr[i];
				index++;
			}
		}
		int index2 = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] % 2 == 0) {
				evenArray[index2] = arr[i];
				index2++;
			}
		}
		int newArray[] = new int[arr.length];
		index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (oddArray[i] != 0) {
				newArray[index++] = oddArray[i];
			}
			if (evenArray[i] != 0) {
				newArray[index++] = evenArray[i];
			}
		}
		System.out.println(Arrays.toString(newArray));

	}

}
