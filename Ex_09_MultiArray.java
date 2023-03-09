package day04_project;

import java.util.Arrays;

public class Ex_09_MultiArray {

	public static void main(String[] args) {

		int arr[][] = new int[3][2];

		/*
		 * {0,0} {0,0} {0,0}
		 */

		arr[0][0] = 1;

		arr[0][1] = 10;

		arr[1][1] = 3;

		arr[2][1] = 5;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
