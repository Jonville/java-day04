package day04_project;

import java.util.Arrays;

public class Ex_04_RemoveArray {

	public static void main(String[] args) {

		int arr[] = { 30, 20, 60, 0, 25, 20, 60, 0, 10, 30 };
		int tempArray[] = new int[arr.length];
		int index = 0;
		boolean zeroFlg = true;
		for (int i = 0; i < arr.length; i++) {
			boolean flg = false;
			if (arr[i] == 0 && zeroFlg) { /*
												 * 0 을 다시 만나면 zeroFlg 가 false 로 바뀜 이 반복문을 쓰는 이유는 tempArray[] <--- 이게 다
												 * {0,0,0,0,0......} 으로 이루어져있기에 0의 중복을 찾아낼수가 있다.
												 * 
												 */
				tempArray[index] = arr[i];
				index++;
				zeroFlg = !zeroFlg;

			}
			
			for (int j = 0; j < tempArray.length; j++) {
				if (arr[i] == tempArray[j]) {
					flg = true;
					break;
				}
			}
			
			if (!flg) {
				tempArray[index] = arr[i];
				index++;
			}
		}
		int newArray[] = new int[index];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = tempArray[i];
		}
		System.out.println(Arrays.toString(newArray));

	}
}
