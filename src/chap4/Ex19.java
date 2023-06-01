package chap4;

public class Ex19 {
	public static void main(String[] args) {
		// 1부터 100 까지의 합은 5050입니다. 그렇다면 1부터 몇 까지 합이 최초로 1000을 초과하는 값일까요?
		// 그 결과를 계산하여 출력하는 코드를 작성하삼요.

		// 1 부터 ? 까지의 합은 ? 임
		int i = 1, total = 0;
		while (total <= 1000) {
			total += i;
			if (total > 1000) {
				continue;
			}
			i++;
		}

		System.out.printf("1 부터 %d 까지의 합은 %d 임",i,total);
	}
}
