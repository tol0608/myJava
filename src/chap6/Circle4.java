package chap6;

public class Circle4 {
	static double pi;
	int radius;

	static {
		Circle4.pi = 3.141592;
	} // static 블럭, 초기화 블럭

	Circle4() {

	}

	static void setPi(double pi) {
		Circle4.pi = pi;
	}

	void setRadius(int rad) {
		radius = rad;
	}

	double getArea() {
		double area;
		area = radius * radius * Circle4.pi;

		return area;
	}
}
