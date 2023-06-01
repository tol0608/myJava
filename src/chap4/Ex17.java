package chap4;

public class Ex17 {
	public static void main(String[] args) {
		int total = 0, i = 1;

//		while (true) {
//			total += i;
//
//			if (total > 1000) {
//				break;
//			}
//
//			i++;
//		}
		for (;;i++) {
			total += i;

			if (total > 1000) {
				break;
			}
		}

		System.out.printf("1 부터 %d 까지의 합은 %d 임", i, total);
	}
}
