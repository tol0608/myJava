package chap7;

public class Ex8 {
	public static void main(String[] args) {
		Circle3 circle = new Circle3(-5);
		System.out.println("area : " + circle.getArea());
		System.out.println("area : " + circle.getCircumference());

		circle.setRadius(-4);
		System.out.println("area : " + circle.getArea());
		System.out.println("area : " + circle.getCircumference());
	}
}
