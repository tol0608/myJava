package chap3;

/* 사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
   실행결과 1.
   하나의 실수를 입력하세요 : 3.64

   버림: 3
   반올림: 4

   실행결과 2.
   하나의 실수를 입력하세요 : 6.2364

   버림: 6
   반올림: 6
*/

import java.util.Scanner;

public class Exam1 {
    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double down, up;
//
//        System.out.print("하나의 실수를 입력하세요");
//        int down = (double)(Math.floor());
//        int up = (double)(Math.round());
//        sc.close();
//
//        System.out.println("버림 : " + down + " 반올림 : " + up);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("\n하나의 실수를 입력하세요: ");
//        double number = sc.nextDouble();
//        int down = (int) Math.floor(number);
//        int up = (int) Math.round(number);
//        sc.close();
//
//        System.out.println("\n버림: " + down + "\n반올림: " + up);

        Scanner sc = new Scanner(System.in);
        double num;

        System.out.print("\n하나의 실수를 입력하세요: ");
        num = sc.nextDouble();
        sc.close();

        System.out.println("\n버림 : " + num);
        System.out.println("반올림 : " + (num + 0.5));

    }
}
