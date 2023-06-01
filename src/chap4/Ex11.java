package chap4;

public class Ex11 {
	public static void main(String[] args) {
		int total = 0;

		/*
			for (int i = 1; i <= 100; i++) {
			total += i;
		}
		*/
		int i = 1;
		while ( i <= 100 ) {
			total += i;
			i++;
		}
		System.out.println("1 부터 100 까지의 합 : " + total);
	}
}
