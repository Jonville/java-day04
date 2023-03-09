/*
 * 		{10, 25, 32, 54, 23, 16, 27, 61}

		기본 -> 홀수는 오름차순, 짝수는 내림차순
			-> 홀, 짝 순으로 출력

		{23, 54, 25, 32, 27, 16, 61, 10 }
 */

package day04_project;

import java.util.Arrays;

public class Ex_06_OddEvenArray {

	public static void main(String[] args) {

		int arr[] = { 10, 25, 32, 54, 23, 15, 27, 61 };

		int newArray[] = new int[arr.length];

		Arrays.sort(arr);

		int oddIndex = 0;
		int evenIndex = arr.length - 1;

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 1) {
				newArray[oddIndex] = arr[i];
				oddIndex += 2;

			} else {
				newArray[evenIndex] = arr[i];
				evenIndex -= 2;
			}

		}
		System.out.println(Arrays.toString(newArray));

	}

}
