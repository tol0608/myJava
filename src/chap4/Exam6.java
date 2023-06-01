package chap4;

import java.util.Scanner;

/*
아래의 가위바위보 코드를 이용하여 사용자가 이길때 까지 하는 가위바위보 코드를 만드시오.
 */

public class Exam6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = 0, com=0;
		boolean isWin = false;
		String userStr = "", comStr = "", result = "";
		String intro = "\n\t [ 가위바위보 게임 ] \n" +
				"\n" +
				"\t 1.가위 \n" +
				"\t 2.바위 \n" +
				"\t 3.보 \n" +
				"\t >>> ";

		do {
			com = (int) (Math.random() * 3);

			System.out.print(intro);
			user = sc.nextInt() - 1;

			switch (user) {
				case 0:
					userStr = "가위";
					break;
				case 1:
					userStr = "바위";
					break;
				case 2:
					userStr = "보";
					break;
				default:
					System.out.println("가위바위보에서 내셈");
					continue;
			}

			switch (com) {
				case 0:
					comStr = "가위";
					break;
				case 1:
					comStr = "바위";
					break;
				case 2:
					comStr = "보";
					break;
			}

			switch (user - com) {
				case 0:
					result = "비김";
					break;
				case 1:
				case -2:
					result = "이김 v";
					isWin = true;
					break;
				case -1:
				case 2:
					result = "짐";
					break;
			}
			System.out.printf("\n\t 사용자 : %s, 컴퓨터 : %s \n", userStr, comStr);
			System.out.printf("\t 가위바위보 결과: %s \n", result);

		} while (!isWin);

		sc.close();
		System.out.printf("\n\t 감사요. 담에보삼. \n");

	}
}
