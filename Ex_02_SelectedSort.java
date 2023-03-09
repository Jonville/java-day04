package day04_project;

import java.util.Arrays;

public class Ex_02_SelectedSort {
	public static void main(String[] args) {
		int[] arr = { 30, 20, 50, 15, 25 };
		// 1. 배열에 있는 수의 평균 구하기.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / arr.length);

		// 2. 배열에서 최대값과 최소값 구하기.
		// 2-1. 최소값의 인덱스(위치 값) 구하기.
		int max = arr[0];
		int min = arr[0];
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			// max = Math.max(arr[i], max);		<=== 이렇게도 가능하다.
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		System.out.println("큰 값 : " + max);
		System.out.println("작은 값 : " + min);
		System.out.println("작은 값 인덱스: " + minIndex);

		// 2-2. 첫번째 숫자와 최소값의 위치 바꾸기
		
		// 1. 첫번째 값 30을 임시로 저장
		// 2. 최소 값을 첫번째로 이동.
		// 3. 임시로 저장한 값을 최소 값의 위치로 이동.
		
		int temp = arr[0];		// temp = 30 , { 30, 20, 50, 15, 25 }
		arr[0] = arr[minIndex];	// arr[0] = 15 , { 15, 20, 50, 15, 25 }
		arr[minIndex] = temp;	// arr[minIndex] = 30 , { 15, 20, 50, 30, 25 }
		
		
		System.out.println(Arrays.toString(arr));

	}

}
