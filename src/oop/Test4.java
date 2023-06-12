package oop;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("classVar : " + Class2.classVar);

		Class2.classVar = 1000;
		System.out.println("classVar : " + Class2.classVar); // 클래스 이름으로 접근하는게 정석

		Class2 c1, c2; // 인스턴스 변수
		c1 = new Class2();
		c2 = new Class2();

		System.out.println("c1. instanceVar : " + c1.instanceVar);
		System.out.println("c2. instanceVar : " + c2.instanceVar);

		c1.instanceVar = 1234;
		c2.instanceVar = 5678;
		System.out.println("c1. instanceVar : " + c1.instanceVar);
		System.out.println("c2. instanceVar : " + c2.instanceVar);
		System.out.println("c1. classVar : " + c1.classVar);
		System.out.println("c2. classVar : " + c2.classVar); // 레퍼런스로도 접근은 가능하지만 권장하지 않음

		c1.methodA(); // 메서드 변수
	}
}
