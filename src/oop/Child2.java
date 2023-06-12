package oop;

public class Child2 extends Parent{
	int num1;

	Child2() {
		num1 = 200;
	}

	void methodA() {
		System.out.println("Child methodA()");
	}

	void methodB() {
		System.out.println("Parent num1 : " + super.num1);
		super.methodA();
	}
}
