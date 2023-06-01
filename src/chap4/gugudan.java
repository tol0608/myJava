package chap4;
 /*
 사용자에게 구구단의 단을 입력 받아 구구단 결과를 출력하는 코드를 작성하세요.
 - 실행 예
 구구단의 단을 입력하세요: 4
 [ 4단 ]
 4 * 1 = 4
 4 * 2 = 8
 4 * 3 = 12
 . . .
 */

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("구구단의 단을 입력해보삼요 : ");
        int gugu = sc.nextInt();
        sc.close();

        System.out.printf("[ " + gugu + "단" + " ]\n");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %2d\n", gugu, i, gugu * i); // %d는 정수 %2d는 자바에서 정수를 최소 2자리로 표시하는 데 사용되는 형식 지정자
        }

    }
}
