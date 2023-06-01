package chap5;

import java.util.Scanner;

// 아래의 마지막 일자 계산 프로그램을 배열을 이용하여 보다 효율적인 코드로 변경하세요.
public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("년도랑 월을 입력하삼요: ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int date;

		if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
			date = 29;
		} else {
			date = daysInMonth[month - 1];
		}

		System.out.println(year + "년 " + month + "월 의 마지막 일자는 " + date + "일임");
	}
}
