package chap4;

public class Ex12 {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 9) {
			int j = 2;
			while (j <= 9) {
				if (i == 0) {
					System.out.printf("[ %d 단 ]\t\t\t", j);
				}
				else {
					System.out.printf("%d * %d = %2d\t\t", j, i, (i * j));
				}
				j++;
			}
			System.out.println();
			i++;
		}

//아래의 중첩 for 반복문을 중첩 while 반복문으로 바꿔보삼
//		for (int i = 0; i <= 9; i++){
//			for (int j = 2; j <= 9; j++) {
//				if (i == 0) {
//					System.out.printf("[ %d 단 ]\t\t\t", j);
//				}
//				else {
//					System.out.printf("%d * %d = %2d\t\t", j, i, (i * j));
//				}
//			}
//			System.out.println();
//		}
	}
}
