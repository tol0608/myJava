package chap6;

public class FloatToInteger2 {
	double num;

	FloatToInteger2() {

	}

	FloatToInteger2(double num) {
		this.num = num;
	}

	void setNum(double a) {
		this.num = a;
	} // 유효한 실수값을 num에 저장

	int floor() {
		return (int) this.num;
	} // 내림

	int round() {
		return (int) (this.num + 0.5);
	} // 반올림

	int ceil() {
		int result = 0;

		if ((int) this.num == this.num) {
			result = (int) this.num;
		} else {
			result = (int) (this.num + 1);
		}

		return result;
	} // 올림
}
