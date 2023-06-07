package chap6;

import jdk.internal.dynalink.beans.StaticClass;

public class CircleTest3 {
	public static void main(String[] args) {
		System.out.println("Circle2.pi : " + Circle2.pi);

		Circle2 c1, c2;
		c1 = new Circle2();
		c2 = new Circle2();

		System.out.println("c1.pi : " + c1.pi);
		System.out.println("c2.pi : " + c2.pi);

		c1.pi = 3.14;
		System.out.println("Circle2.pi : " + Circle2.pi);
		System.out.println("c1.pi : " + c1.pi);
		System.out.println("c2.pi : " + c2.pi);
	}
}
