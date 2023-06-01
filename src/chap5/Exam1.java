package chap5;

import java.util.Scanner;

// 아래의 가위바위보 게임의 코드를 배열을 이용하여 보다 효율적인 코드로 변경하세요.
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;
		String[] kbb = {"가위", "바위", "보"};
		String result = "";
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

		switch (user - com) {
			case 0:
				result = "비김";
				break;
			case 1:
			case -2:
				result = "이김 v";
				break;
			case -1:
			case 2:
				result = "짐";
				break;
		}

		System.out.printf("\n\t 사용자 : %s, 컴퓨터 : %s \n", kbb[user], kbb[com]);
		System.out.printf("\t 가위바위보 결과: %s \n", result);
	}
}
