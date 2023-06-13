package chap7;

public class Circle5 {
	// 싱글턴
	static Circle5 circle;
	static final double PI = 3.141592;
	private int radius;

	private Circle5(int radius) {
		this.setRadius(radius);
	}

	static Circle5 getCircle5(int radius) {
		if (Circle5.circle == null) {
			Circle5.circle = new Circle5(radius);
		}
		else {
			Circle5.circle.setRadius(radius);
		}
		return Circle5.circle;
	}

	void setRadius(int radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 1;
		}
	}

	int getRadius() {
		return this.radius;
	}

	double getCircumference() {
		return this.radius * 2 * Circle4.PI;
	}

	double getArea() {
		return this.radius * this.radius * Circle4.PI;
	}
}
