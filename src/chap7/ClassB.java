package chap7;

public class ClassB {
	int num2;
	ClassA classA;

	ClassB() {
		this.num2 = 20;
		classA = new ClassA();
	}

	String method2() {
		return "ClassB 클래스의 method2() 임";
	}
}
