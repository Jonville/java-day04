package day04_project;

public class Ex_05_Math {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 20;
		
		System.out.println(Math.max(a, b));		// 최대값
		System.out.println((a >= b) ? a : b);	// 최대값 / 삼항연산자.=== (조건식) ? 참 : 거짓====
		System.out.println(Math.min(a, b));		// 최소값
		System.out.println((a <= b) ? a : b);	// 최소값 / 삼항연산자.=== (조건식) ? 참 : 거짓====
		System.out.println(Math.abs(-123));		// 절대값
		
	}

}
