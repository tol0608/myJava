package chap7;

public class Circle4 {
	static final double PI = 3.141592;
	private int radius;

	Circle4(int radius) throws Exception{
		this.setRadius(radius);
	}

	void setRadius(int radius) throws Exception{
		if (radius > 0) {
			this.radius = radius;
		}
		else {
			throw new Exception("잘못된듯");
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
