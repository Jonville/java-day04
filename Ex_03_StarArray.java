package day04_project;

public class Ex_03_StarArray {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 2, 5, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}
