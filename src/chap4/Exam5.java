package chap4;

/*
[가위바위보 게임]
1.가위
2.바위
3.보
>>> 3

사용자 보, 컴퓨터 가위
가위바위보 결과 ==> 졌습니다.

[코드작성 조건]
1. switch 문을 이용하여 문제를 해결하세요.
2. if 문을 이용하여 문제를 해결하세요.
*/

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;
		String userStr = "", comStr = "", result = "";
		String intro = "\n\t [ 가위바위보 게임 ] \n" +
				"\n" +
				"\t 1.가위 \n" +
				"\t 2.바위 \n" +
				"\t 3.보 \n" +
				"\t >>> ";

		com = (int) (Math.random() * 3);

		System.out.print(intro);
		user = sc.nextInt() - 1;
		sc.close();

		switch (user) {
			case 0: userStr = "가위"; break;
			case 1: userStr = "바위"; break;
			case 2: userStr = "보"; break;
		}

		switch (com) {
			case 0: comStr = "가위"; break;
			case 1: comStr = "바위"; break;
			case 2: comStr = "보"; break;
		}

		switch (user - com) {
			case 0: result = "비김"; break;
			case 1: case -2: result = "이김 v"; break;
			case -1: case 2: result = "짐"; break;
		}

		System.out.printf("\n\t 사용자 : %s, 컴퓨터 : %s \n", userStr, comStr);
		System.out.printf("\t 가위바위보 결과: %s \n", result);

	}


}
