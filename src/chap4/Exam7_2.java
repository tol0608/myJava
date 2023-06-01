package chap4;

/*
아래의 가위바위보 코드를 이용하여 사용자가 원할때까지 하는 가위바위보 코드를 만드시오.
 */

import java.util.Scanner;

public class Exam7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = 0, com = 0;
		String userStr = "", comStr = "", result = "", input = "";
		String intro = "\n\t [ 가위바위보 게임 ] \n" +
				"\n" +
				"\t 1.가위 \n" +
				"\t 2.바위 \n" +
				"\t 3.보 \n" +
				"\t >>> ";

		while (true) {
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
					result = "이김";
					break;
				case -1:
				case 2:
					result = "짐";
					break;
			}
			System.out.printf("\n\t 사용자 : %s, 컴퓨터 : %s \n", userStr, comStr);
			System.out.printf("\t 가위바위보 결과: %s \n", result);

			sc.nextLine(); // 버퍼 비우기
			System.out.print("끝? (q) : ");
			input = sc.nextLine();

			if (input.length() == 1 && (input.charAt(0) == 'q' || input.charAt(0) == 'Q')) {
				break;
			}
		}

		sc.close();
		System.out.printf("\n\t 감사요. 담에보삼. \n");
	}
}


