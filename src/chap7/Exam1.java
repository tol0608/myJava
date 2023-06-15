package chap7;

// 사용자에게 년, 월, 일을 입력 받아 입력한 일자의 요일을 반환하는 프로그램을 작성
// 단, 반드시 객체지향적인 코드로 작성해야함

// < 실행 예 >
// 년, 월, 일을 입력하세요 : 2023 6 12
// 입력하신 2023년 6월 12일은 월요일 입니다.

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyCalendar calendar;
		int year, month, day;

		System.out.print("년, 월, 일 : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();

		calendar = new MyCalendar(year, month, day);
		System.out.printf("입력한 %d년 %d월 %일은 %s요일인듯 \n", year, month, day, calendar.getDayOfWeek());
	}
}
