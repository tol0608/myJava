package chap3;

// 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 모두 80점 이상이면 "합격입니다", 아니면 "불합격입니다" 값을 출력하는 코드 - 1번
// 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 중 한 과목이라도 80점 미만인 점수가 있으면 "과락입니다", 아니면 "과락이 아닙니다" 출력하는 코드 - 2번
// 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 모두 80점 이상이면 "합격입니다", 아니면 "불합격입니다" 값을 출력하는 코드. 단, and 연산자 금지 - 3번

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eng, math;
        boolean result;

        System.out.print("영어와 수학 점수를 입력하세요 >>> ");
        eng = sc.nextInt();
        math = sc.nextInt();
        sc.close();

//            if (eng >= 80 && math >= 80) {
//                System.out.println("합격입니다.");
//            } else {
//                System.out.println("불합격입니다.");
//            } // if문으로 하면...

//            result = eng >= 80 && math >= 80; // exam1
//            System.out.println("Exam1 : " + (result ? "합격입니다." : "불합격입니다."));

//            if (eng < 80 || math < 80) {
//            System.out.println("과락입니다.");
//            } else {
//            System.out.println("과락이 아닙니다.");
//            }

//            result = eng < 80 || math < 80; // exam2
//            System.out.println("Exam2 : " + (result ? "과락이네유" : "과락이아닌뎁쇼?"));

//            if (!(eng < 80 && math < 80)) {
//                System.out.println("합격입니다.");
//            } else {
//                System.out.println("불합격입니다.");
//            }

        result = !(eng < 80 || math < 80); // exam3
        System.out.println("Exam3 : " + (result ? "합격입니다." : "불합격입니다."));
    }
}
