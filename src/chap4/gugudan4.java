package chap4;
 /*
    2단 부터 9단 까지의 전체 구구단을 출력하는 코드
 - 실행 예
 4 * 1 = 4
 4 * 2 = 8
 4 * 3 = 12
 . . .
 단, 중첩 for 반복문 사용
 */

public class gugudan4 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, (i * j));
			}
		}

	}
}
