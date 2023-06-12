package oop;

public class Parent2 {
	int num1;

	// 자식 인스턴스가 생성될 때 항상 부모의 인스턴스가 먼저 생성
	// 단, 자동 생성되는 부모 인스턴스는 매개변수가 없는 생성자를 이용하여 생성
	Parent2 () {
		this.num1 = 100;
		System.out.println("Parent 클래스의 인스턴스 생성");
	}
}
