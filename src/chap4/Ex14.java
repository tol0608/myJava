package chap4;

public class Ex14 {
	public static void main(String[] args) {
		int i = 0;
		do {
			int j = 2;
			do {
				if (i == 0) {
					System.out.printf("[ %d 단 ]\t\t\t", j);
				} else {
					System.out.printf("%d * %d = %2d\t\t", j, i, (i * j));
				}
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		} while (i <= 9);
	}
}
