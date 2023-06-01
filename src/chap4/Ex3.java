package chap4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 시험점수를 입력하세요 : ");
        int score = sc.nextInt();
        sc.close();

        if (score >= 90) {
            System.out.println("참잘한듯.");
        } else {
            if (score >= 80) {
                System.out.println("잘한듯");
            } else {
                if (score >= 70) {
                    System.out.println("적당한듯");
                }
            }

        }

        System.out.println("프로그램 종료~");
    }
}
