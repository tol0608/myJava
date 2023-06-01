package chap3;

// 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 모두 80점 이상이면 true, 아니면 false 값을 출력하는 코드 - 1번
// 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 중 한 과목이라도 80점 미만인 점수가 있으면 true, 아니면 false 출력하는 코드 - 2번
// 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 모두 80점 이상이면 true, 아니면 false 값을 출력하는 코드. 단, and 연산자 금지 - 3번

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eng, math;
        boolean result;

        System.out.print("영어와 수학 점수를 입력하세요 >>> ");
            eng = sc.nextInt();
            math = sc.nextInt();
            sc.close();

//            result = eng >= 80 && math >= 80; // exam1
//            System.out.println("Exam1 : " + result);

//            result = eng < 80 || math < 80; // exam2
//            System.out.println("Exam2 : " + result);

        result = !(eng < 80 || math < 80); // exam3
        System.out.println("Exam3 : " + result);
        // Not 연산자의 용도 : 기존의 조건을 반전시키는 역할
    }
}
