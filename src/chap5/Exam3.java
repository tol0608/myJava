package chap5;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

/*
	[ 요일 계산 프로그램 ]
	사용자에게 년, 월, 일을 입력으로 받아 해당 일자의 요일을 출력하는 코드를 작성하세요.
	--------------------------------------------------------------
	< 실행 예 >
	년, 월, 일을 입력하세요 : 2023 6 2

	2023년 6월 2일은 금요일입니다.
	--------------------------------------------------------------
	< 요일 계산 알고리즘 >
	서기 1년 1월 1일은 월요일 입니다.
*/
public class Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		int count = 0;
		int[] lastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 배열을 맞추기 위해서 -1 추가함
		String[] week = {"일", "월", "화", "수", "목", "금", "토"}; // 문자열 = string

		System.out.print("년도, 월, 일을 입력하삼요: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();

		// 윤년이면 366일이고 평년이면 365일임
		for (int i = 1; i <= year - 1; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				// 윤년
				count += 366;
			} else {
				// 평년
				count += 365;
			}
		}
		System.out.printf("%d 년은 %d 일임\n", year, count);

		// 달 구했음
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			lastDays[2] = 29;
		}

		for (int i = 1; i <= month - 1; i++) {
			count += lastDays[i];
		}
		System.out.printf("%d월 \n", month);

		// 일 구했음
		count += day;
		System.out.printf("%d 일 \n", count);

		// 요일 넣어주자
		count %= 7;
		System.out.printf("%s 요일", week[count]);


//		System.out.printf("%d 년 %d 월의 마지막 일자는 %d 일임", year, month, lastDays[month]);
	}
}
