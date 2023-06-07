package chap6;

public class Ex6 {
	void roReturn() {
		System.out.println("첫 번째 문장");
		System.out.println("두 번째 문장");
		System.out.println("세 번째 문장");
	}
	void return1() {
		System.out.println("return1() 메서드 호출");

		return;
	}
	String return2() {
		System.out.println("return2() 메서드 호출");

		return "호출결과";
	}
	public static void main(String[] args) {
		// Ex5 실행결과와 동일한 결과를 출력하는 코드를 작성
		Ex6 ex6 = new Ex6();
		ex6.roReturn();
		ex6.return1();
		ex6.return2();

		String value = ex6.return2();
		System.out.println(ex6.return2());
	}
}
