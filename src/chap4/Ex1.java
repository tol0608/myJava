package chap4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 시험점수를 입력하세요 : ");
        int score = sc.nextInt();
        sc.close();

        if (score >= 70) {
            System.out.println("합격입니다.");
            System.out.println("추카염.");
        } else {
            System.out.println("탈락염.");
        }

        System.out.println("프로그램 종료~");
    }
}
