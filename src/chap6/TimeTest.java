package chap6;

public class TimeTest {
	public static void main(String[] args) {
//		Time t1, t2, t3;
//
//		t1 = new Time();
//		t2 = new Time();
//		t3 = new Time();
//
//		t1.setHour(14);
//		t1.setMinute(30);
//		t1.setSecond(25);
//
//		t2.setHour(12);
//		t2.setMinute(05);
//		t2.setSecond(10);
//
//		t3.setHour(20);
//		t3.setMinute(50);
//		t3.setSecond(30);
//
//		System.out.println("time1 : " + t1.currentTime());
//		System.out.println("time2 : " + t2.currentTime());
//		System.out.println("time3 : " + t3.currentTime());
		Time[] timeArr; // 레퍼런스 배열변수
		timeArr = new Time[3]; // 레퍼런스 배열 생성

		timeArr[0] = new Time();
		timeArr[1] = new Time();
		timeArr[2] = new Time();

		timeArr[0].setHour(14);
		timeArr[0].setMinute(30);
		timeArr[0].setSecond(25);

		timeArr[1].setHour(12);
		timeArr[1].setMinute(05);
		timeArr[1].setSecond(40);

		timeArr[2].setHour(5);
		timeArr[2].setMinute(02);
		timeArr[2].setSecond(59);

		for (int i = 0; i < timeArr.length; i++) {
			System.out.printf("time%d] %s \n", i+1, timeArr[i].currentTime());
		}

	}
}
