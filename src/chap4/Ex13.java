package chap4;

public class Ex13 {
	public static void main(String[] args) {
		int total = 0;

		/*
			for (int i = 1; i <= 100; i++) {
			total += i;
		}
		*/
		int i = 1;
		do {
			total += i;
			i++;
		} while (i <= 100);
		System.out.println("1 부터 100 까지의 합 : " + total);
	}
}
