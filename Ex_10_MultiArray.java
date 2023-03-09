package day04_project;

public class Ex_10_MultiArray {

	public static void main(String[] args) {

		double score[][] = { { 3.3, 3.4 }, // 1학년 1, 2학기 평점
							{ 3.5, 3.6 }, // 2학년 1, 2학기 평점
							{ 3.7, 4.0 }, // 3학년 1, 2학기 평점
							{ 4.1, 4.2 } }; // 4학년 1, 2학기 평점

		double sum = 0;

		int cnt = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {

				sum += score[i][j];
			}
			System.out.println(i + 1 + "학년 평균 : " + (sum / score[i].length));
		}

	}
}
