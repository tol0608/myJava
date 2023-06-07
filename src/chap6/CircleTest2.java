package chap6;

import jdk.internal.dynalink.beans.StaticClass;

public class CircleTest2 {
	public static void main(String[] args) {
		Circle c1, c2;
//		c1 = null; // 레퍼런스 클래스가 가질 수 있는 유일한 상수값
		c1 = new Circle();
		c2 = new Circle();

		System.out.println("c1] pi : " + c1.pi + ", radius : " + c1.radius + ", area : " + c1.getArea());
		System.out.println("c2] pi : " + c2.pi + ", radius : " + c2.radius + ", area : " + c2.getArea());

//		c1.radius = 5;
		c1.setRadius(7);
		c1.pi = 3.141592;
		System.out.println("c1] pi : " + c1.pi + ", radius : " + c1.radius + ", area : " + c1.getArea());

		c2.setRadius(7);
		c2.pi = 3.14;
		System.out.println("c2] pi : " + c2.pi + ", radius : " + c2.radius + ", area : " + c2.getArea());
	}
}
