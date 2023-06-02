package chap5;

import java.util.Scanner;

// 아래의 마지막 일자 계산 프로그램을 배열을 이용하여 보다 효율적인 코드로 변경하세요.
public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month;
		int[] days = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 배열을 맞추기 위해서 -1 추가함

		System.out.print("년도랑 월을 입력하삼요: ");
		year = sc.nextInt();
		month = sc.nextInt();
		sc.close();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			days[2] = 29;
		}

		System.out.printf("%d 년 %d 월의 마지막 일자는 %d 일임", year, month, days[month]);
	}
}
