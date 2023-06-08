package chap6;

// Exam1
public class FloatToInteger {
	double num;

	void setNum(double a) {
		num = a;
	} // 유효한 실수값을 num에 저장

	int floor() {
		return (int) num;
	} // 내림

	int round() {
		return (int) (num + 0.5);
	} // 반올림

	int ceil() {
		int result = 0;

		if ((int) num == num) {
			result = (int) num;
		} else {
			result = (int) (num + 1);
		}

		return result;
	} // 올림
}
