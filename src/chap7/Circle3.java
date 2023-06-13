package chap7;

public class Circle3 {
	static final double PI = 3.141592;
	private int radius;

	Circle3(int radius) {
		this.setRadius(radius);
	}
	// setter의 시작은 void로 해야함
	void setRadius(int radius) {
		if (radius > 0) {
			this.radius = radius;
		}
		else {
			this.radius = 1;
		}
	}
	int getRadius() {
		return this.radius;
	}

	double getCircumference() {
		return this.radius * 2 * Circle3.PI;
	}

	double getArea() {
		return this.radius * this.radius * Circle3.PI;
	}
}
