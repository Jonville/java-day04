package day04_project;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_08_ExamTotal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int arr[] = new int[6];

		double avg = 0;

		int min_cnt = 0;

		int sum = 0;

		int pluscnt = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = scanner.nextInt();

			if (num > 0) {

				arr[i] = num;
			} else {
				System.out.println("1 이상의 숫자를 입력하세요.");
				i--;
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 1) {
				arr[i] = -arr[i];
			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				sum += arr[i];
				pluscnt++;
			}

			if (arr[i] < 0) {

				min_cnt++;
			}

		}

		System.out.println(Arrays.toString(arr));
		System.out.println(min_cnt);
		System.out.println((double) sum / pluscnt);

	}

}
