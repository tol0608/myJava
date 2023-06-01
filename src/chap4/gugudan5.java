package chap4;
 /*
    2단 부터 9단 까지의 전체 구구단을 출력하는 코드
 - 실행 예
 4 * 1 = 4
 4 * 2 = 8
 4 * 3 = 12
 . . .
 */

public class gugudan5 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.printf("\n [ %d 단 ]  \n", i);

			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, (i * j));
			}
		}

	}
}
