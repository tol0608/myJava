package chap6;

public class Ex7 {
	void printTitle() {
		System.out.println("\t 원의 넓이 계산 프로그램 ");
	}

	// 프로그램의 제목을 출력하는 매서드
	void printCharacter(char ch, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(ch);
		}

		System.out.println();
	}

	// 입력으로 주어진 문자를 count만큼 출력하는 매서드
	double getPi() {
		double pi = 3.141592;

		return pi;
	}

	// Pi값을 반환하는 매서드
	double getCircleArea(int radius) {
		double result;
		result = radius * radius * getPi();

		return result;
	}

	// 반지름을 입력으로 받아 원의 넓이를 계산하여 반환하는 매서드
	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		int radius = 7;

		ex7.printCharacter('*', 30);
		ex7.printTitle();
		ex7.printCharacter('*', 30);

		System.out.printf("반지름이 %d인 원의 넓이는 %f입니다.", radius, ex7.getCircleArea(radius));
	}
}
