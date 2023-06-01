package chap4;

/*
1 부터 100 사이의 모든 소수를 아래와 같이 출력하는 코드를 작성하세요.

[실행 예]
 2   3   4   7  11
13  17  19  23  29
31  37  41  43  47
...
*/
public class Exam8 {
	public static void main(String[] args) {
		/*
		step1] 1과 자신을 제외한 20의 모든 약수를 출력
		*/

//		for (int i = 2; i <= 20 / 2; i++) {
//			if(20 % i == 0) {
//				System.out.print(i + "  ");
//			}
//		}

		/*
		step2] 1과 자신을 제외한 2부터 20 까지의 모든 수에 대한 약수를 출력
		*/

//		for (int i = 2; i <= 20; i++) {
//			System.out.printf("%2d 의 약수 : ", i);
//			for (int j = 2; j <= i / 2; j++) {
//				if(i % j == 0) {
//				System.out.print(j + "  ");
//				}
//			}
//				System.out.println();
//		}

		/*
		step3] 2부터 100 사이의 모든 소수를 구해서 출력
		*/

//		boolean isPrime;
//		for (int i = 2; i <= 100; i++) {
//			isPrime = true; // 각각의 i 값은 소수라고 가정
//
//			for (int j = 2; j <= i / 2; j++) {
//				if(i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//
//			if (isPrime == true) {
//				System.out.print(i + "  ");
//			}
//		}

		/*
		step4] 1부터 100 사이의 모든 소수를 한 줄에 5개씩 출력
		*/

		boolean isPrime;
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			isPrime = true; // 각각의 i 값은 소수라고 가정

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime == true) {
				System.out.printf("%4d  ", i);
				count++;

				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}


//		int count = 0;
//
//		for (int i = 2; i <= 100; i++) {
//			boolean isPrime = true;
//
//			// 소수인지 확인
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//
//			// 소수인 경우 출력
//			if (isPrime) {
//				System.out.printf("%4d", i);
//				count++;
//
//				// 5개씩 출력하고 줄바꿈
//				if (count % 5 == 0) {
//					System.out.println();
//				}
//			}
//		}

	}
}
