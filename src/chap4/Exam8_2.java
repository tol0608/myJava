package chap4;

public class Exam8_2 {
	public static void main(String[] args) {
		int i, j;
		int count = 0;
		boolean isNum;

		for (i = 2; i <= 100; i++) {
			isNum = true;

			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isNum = false;
					break;
				}
			}

			if (isNum == true) {
				System.out.printf("%4d  ", i);
				count++;

				if (count % 5 == 0) {
					System.out.println();
				}
			}

		}
	}
}
