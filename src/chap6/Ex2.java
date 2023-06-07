package chap6;

public class Ex2 {
	public static void main(String[] args) {
		Time[] timeArr = new Time[3]; // null값으로 초기화 된 상태

		for (int i = 0; i < timeArr.length; i++) {
			timeArr[i] = new Time();
		} // 배열을 읽기목적으로만 사용할때만 향상된 for문을 사용한다

		timeArr[0].setHour(14);
		timeArr[0].setMinute(30);
		timeArr[0].setSecond(25);

		timeArr[1].setHour(12);
		timeArr[1].setMinute(05);
		timeArr[1].setSecond(40);

		timeArr[2].setHour(5);
		timeArr[2].setMinute(02);
		timeArr[2].setSecond(59);

		int i = 0;
		for (Time time : timeArr) {
			System.out.printf("time%d] %s \n", i + 1, time.currentTime());
			i++;
		}

//
//		timeArr[0].setHour(14);
//		timeArr[0].setMinute(30);
//		timeArr[0].setSecond(25);
//
//		timeArr[1].setHour(12);
//		timeArr[1].setMinute(05);
//		timeArr[1].setSecond(40);
//
//		timeArr[2].setHour(5);
//		timeArr[2].setMinute(02);
//		timeArr[2].setSecond(59);
//		for (int i = 0; i < timeArr; i++) {
//
//		}

	}
}
