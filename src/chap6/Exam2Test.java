//package chap6;
//
//import java.util.Scanner;
//
//public class Exam2Test {
//
//	private Exam2 exam2;
//	private String[] kbb = {"가위", "바위", "보"};
//	public Exam2() {
//		this.exam2 = new Exam2();
//	}
//
//	public void PlayKbb () {
//		Scanner sc = new Scanner(System.in);
//		int user, com;
//
//		String intro = "\n\t [ 가위바위보 게임 ] \n" +
//				"\n" +
//				"\t 1.가위 \n" +
//				"\t 2.바위 \n" +
//				"\t 3.보 \n" +
//				"\t >>> ";
//
//		System.out.print(intro);
//		user = sc.nextInt() - 1;
//		sc.close();
//
//		int com = exam2.setCom();
//		String result = exam2.kbbResult(user, com);
//
//		System.out.println("사용자 : " + kbb(user) + " 컴퓨터 : " + kbb[com]);
//		System.out.printf("\t 가위바위보 결과: %s \n", result);
//	}
//	public static void main(String[] args) {
//
//
//	}
//}
