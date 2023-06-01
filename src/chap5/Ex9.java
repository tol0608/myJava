package chap5;

import java.util.Scanner;

//사용자에게 3명의 학생에 대한 국어, 영어, 수학, 과학 점수를 입력 받아 1등인 학생의 성적과 총점, 평균을 출력하는 코드를 작성
public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[3][4];
		int total = 0, firstIdx = 0, temp;
		double avg;

		// 학생 3명의 국어, 영어, 수학, 과학 점수 입력받기
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d 번째 학생의 국어, 영어, 수학, 과학 점수를 입력하삼요 : ", i + 1);
			temp = 0;
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = sc.nextInt();
				temp += scores[i][j];
			}

			if (temp > total) {
				total = temp;
				firstIdx = i;
			}
		}
		sc.close();

		System.out.print("\n 1등 학생의 성적 : ");
		for (int i = 0; i < scores[firstIdx].length; i++) {
			System.out.printf("%2d  ", scores[firstIdx][i]);
		}

		// 총점, 평균 계산
		int[] sumScores = new int[scores[0].length];
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sumScores[j] += scores[i][j];
			}
		}
		System.out.print("\n 각 과목별 총점 : ");
		for (int i = 0; i < sumScores.length; i++) {
			System.out.printf("%2d  ", sumScores[i]);
		}

		avg = (double) total / scores[firstIdx].length;
		System.out.printf("\n 1등 학생의 평균 : %.2f", avg);
	}

}
