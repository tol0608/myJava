package chap4;

public class Ex18 {
	public static void main(String[] args) {
		// 1부터 100 사이의 짝수의 합을 구하는 코드를 작성하세요.
		// 단, continue를 사용함.
		int total = 0, i = 0;

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				continue;
//			}
//			total += i;
//		}

		while (i <= 100) {
			if (i % 2 != 0) {
				i++;
				continue;
			}
			total += i;
			i++;
		}

		System.out.println("Total : " + total);
	}
}
