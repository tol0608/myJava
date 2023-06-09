package chap6;

// 아래의 가위바위보 코드를 이용하여 객체지향 기법을 적용한 코드로 변환하여 작성하세요.

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KawiBawiBo kbb = new KawiBawiBo();
		String input = "";
		String intro = "\n\t [ 가위바위보 게임 ] \n" +
				"\n" +
				"\t 1.가위 \n" +
				"\t 2.바위 \n" +
				"\t 3.보 \n" +
				"\t >>> ";

		while (true) {
//			kbb.setCom();

			System.out.print(intro);
			kbb.setUser(sc.nextInt());

			System.out.println("\n\t 사용자 : " + kbb.getUser() + " 컴퓨터 : " + kbb.getCom());
			System.out.printf("\t 가위바위보 결과: %s \n", kbb.judge());

			sc.nextLine(); // 버퍼 비우기
			System.out.print("끝? (q) : ");
			input = sc.nextLine();

			if (input.length() == 1 && (input.charAt(0) == 'q' || input.charAt(0) == 'Q')) {
				break;
			}
		}
		sc.close();
		System.out.printf("\n\t 감사요. 담에보삼. \n");

//		Scanner sc = new Scanner(System.in);
//		KawiBawiBo kbb;
//		String intro = "\n\t [ 가위바위보 게임 ] \n" +
//				"\n" +
//				"\t 1.가위 \n" +
//				"\t 2.바위 \n" +
//				"\t 3.보 \n" +
//				"\t >>> ";
//		System.out.print(intro);
//		kbb = new KawiBawiBo(sc.nextInt());
//		sc.close();
//
//		System.out.println("\n\t 사용자 : " + kbb.getUser() + " 컴퓨터 : " + kbb.getCom());
//		System.out.printf("\t 가위바위보 결과: %s \n", kbb.judge());
	}

}
