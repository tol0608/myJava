package oop;

public class Test3 {
	public static void main(String[] args) {
//		Time[] arr = new Time[] {new Time(), new Time(), new Time()}; 아래와 같음

		Time[] arr = {new Time(), new Time(), new Time()}; // 선언, 생성, 초기화 1문장으로

		arr[0].hour = 10;
		arr[0].minute = 30;
		arr[0].second = 40;

		arr[1].hour = 2;
		arr[1].minute = 20;
		arr[1].second = 30;

		arr[2].hour = 5;
		arr[2].minute = 30;
		arr[2].second = 55;

		for (Time time : arr) {
			System.out.println(time.getCurrentTime());
		}
	}


}
