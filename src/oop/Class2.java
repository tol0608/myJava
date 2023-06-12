package oop;

public class Class2 {
	static int classVar;
	int instanceVar;

	void methodA() {
		int methodVar;
		methodVar = 10;
		// 메서드 변수는 반드시 초기화를 해야만 사용할 수 있음

		System.out.println("methodVar : " + methodVar);
	}
}
