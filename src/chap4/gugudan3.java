package chap4;
 /*
    2단 부터 9단 까지의 전체 구구단을 출력하는 코드
 - 실행 예
 4 * 1 = 4
 4 * 2 = 8
 4 * 3 = 12
 . . .
 */

public class gugudan3 {
	public static void main(String[] args) {
		int gugu = 2, num = 1;

		for (int i = 0; i < 72; i++) {
			if (num == 1) {
				System.out.printf("\n [ %d 단 ] \n", gugu);
			}

			System.out.printf("%d * %d = %2d\n", gugu, num, gugu * num);
			num++;

			if (num == 10) {
				gugu++;
				num = 1;
			}
		}
	}
}
