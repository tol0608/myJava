package chap6;

public class CircleTest4 {
	public static void main(String[] args) {
		Circle3 c1, c2;

		Circle3.setPi(3.14);
		c1 = new Circle3();
		c2 = new Circle3();

		c1.setRadius(5);
		c2.setRadius(7);
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다. \n", c1.radius, c1.getArea());
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다. \n", c2.radius, c2.getArea());

		Circle3.setPi(3.141592);
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다. \n", c1.radius, c1.getArea());
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다. \n", c2.radius, c2.getArea());
	}
}
