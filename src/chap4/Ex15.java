package chap4;

public class Ex15 {
	public static void main(String[] args) {
		// 1부터 100 까지의 합은 5050입니다. 그렇다면 1부터 몇 까지 합이 최초로 1000을 초과하는 값일까요?
		// 그 결과를 계산하여 출력하는 코드를 작성하삼요.

		// 1 부터 ? 까지의 합은 ? 임
		int i = 0, total = 0;
//		while (total <= 1000) {
//			i++;
//			total += i;
//		}

		// 문제, 상황에 따라서 조건의 미지수에 위치가 바뀔 수 있다.

		for (i = 0; i <= 45; i++) {
			total += i;
		}

		System.out.printf("1 부터 %d 까지의 합은 %d 임",i,total);
//		System.out.printf("total: %d", total);
	}
}
