package chap4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 시험점수를 입력하세요 : ");
        int score = sc.nextInt();
        sc.close();

        if (score >= 98) {
            System.out.println("A+");
        } else if (score >= 94) {
            System.out.println("A-");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 88) {
            System.out.println("B+");
        } else if (score >= 84) {
            System.out.println("B-");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
//        System.out.println("프로그램 종료~");
    }
}

