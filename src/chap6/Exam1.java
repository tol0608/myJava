package chap6;

import java.util.Scanner;

/*
   사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
   단, 객체지향적으로 코드를 작성합니다.

   실행결과 1.
   하나의 실수를 입력하세요 : 3.64

   버림: 3
   반올림: 4
   올림: 4

   실행결과 2.
   하나의 실수를 입력하세요 : 6.2364

   버림: 6
   반올림: 6
   올림: 7

   실행결과 3.
   하나의 실수를 입력하세요 : 4.0

   버림: 4
   반올림: 4
   올림: 4
*/
public class Exam1 {
	public static void main(String[] args) {
		FloatToInteger fti = new FloatToInteger();
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.print("하나의 실수를 입력하삼요 : ");
		num = sc.nextDouble();
		sc.close();

		fti.setNum(num);
		System.out.println("버림 : " + fti.floor());
		System.out.println("반올림 : " + fti.round());
		System.out.println("올림 : " + fti.ceil());
	}
}
