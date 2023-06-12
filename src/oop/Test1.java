package oop;

public class Test1 {
	public static void main(String[] args) {
		Class1 class1;
		class1 = new Class1(); // 객체지향 2단계

		System.out.println("num : " + class1.num);
		class1.methodA();

		class1.num = 1234;
		System.out.println("num : " + class1.num);
	}
}
