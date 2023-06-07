package chap6;

public class Ex5 {
	public static void main(String[] args) {
		// roReturn() 메서드를 호출하여 실행하는 코드
		ReturnTest test = new ReturnTest();
		test.roReturn();
		test.return1();
		test.return2();
		String returnValue = test.return2();
		System.out.println(test.return2());
	}
}
