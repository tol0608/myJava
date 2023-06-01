package chap4;

public class Ex16 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println("i : " + i);

			if(i == 3) {
				break;
			}

			for (int j = 0; j < 100; j++) {
				System.out.println("\t j : " + j);

				if(j == 4) {
					break;
				}
			}
		}
	}
}
