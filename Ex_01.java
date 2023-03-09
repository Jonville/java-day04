/*
 * 
 *  같은 특성이있으면 배열을 사용해주면된다.
 *  관련있는 데이터에 쓰일때 효율적이다.
 */


package day04_project;


public class Ex_01 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		
		for(int num : arr) {		// for(int i=0; i < arr.length ; i++) 과 같음
			System.out.println(num);
		}
		
		
		
	}
}
