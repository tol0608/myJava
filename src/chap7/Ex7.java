package chap7;

public class Ex7 {
	public static void main(String[] args) {
		Circle2 circle2 = new Circle2(-5);
		System.out.println("area : " + circle2.getArea());
		System.out.println("area : " + circle2.getCircumference());

		circle2.radius = -5;
		System.out.println("area : " + circle2.getArea());
		System.out.println("area : " + circle2.getCircumference());
	}
}
