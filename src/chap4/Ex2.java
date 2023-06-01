package chap4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 시험점수를 입력하세요 : ");
        int score = sc.nextInt();
        sc.close();

        if (score >= 70) {
            System.out.println("합격인듯.");
            System.out.println("추카요.");
        } else {
            System.out.println("불합격임.");
            System.out.println("담에 다시 치삼요.");
        }

        System.out.println("프로그램 종료~");
    }

}
