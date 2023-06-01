package chap5;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuCount, total = 0;
		int[] stuScores;

		System.out.print("학생 수를 입력하삼요 : ");
		stuCount = sc.nextInt();

		stuScores = new int[stuCount]; // 동적배열

		System.out.printf("%d 명의 학생들의 점수를 입력하삼요 : ", stuScores.length);
		for (int i = 0; i < stuScores.length; i++) {
			stuScores[i] = sc.nextInt();
		}

		System.out.println("\n[ 입력한 학생의 점수 ]");
		for (int i = 0; i < stuScores.length; i++) {
			System.out.print(stuScores[i] + "  ");
			total += stuScores[i];
		}

		System.out.printf("\n 총점 : %d, 평균 : %.2f \n", total, (double)total/stuScores.length);

		// 입력받은 점수 중, 가장 높은 점수와 낮은 점수를 출력

		int max = stuScores[0];
		int min = stuScores[0];

		for (int i = 1; i < stuScores.length; i++) {
			if (stuScores[i] > max) {
				max = stuScores[i];
			}
			if (stuScores[i] < min) {
				min = stuScores[i];
			}
		}

		System.out.printf("\n 1등 점수 : %d \n", max);
		System.out.printf("\n 꼴등 점수 : %d \n", min);


	}
}
