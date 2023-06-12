package oop;

public class Test6 {
	void callByValue(int num) {
		num *= 2;

		System.out.println("callByValue() num : " + num);
	}

	void callByReference(Time[] arr) {
		// Time 클래스 배열을 입력으로 받아 모든 타임 객체의 값을 0시 0분 0초로 초기화 하는 코드 작성
		System.out.println("\n callByReference() arr : ");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i].hour = 0;
//			arr[i].minute = 0;
//			arr[i].second = 0;
//
//			System.out.println(arr[i].getCurrentTime());
//		}

		for (Time time : arr) {
			time.hour = 0;
			time.minute = 0;
			time.second = 0;

			System.out.println(time.getCurrentTime());
		}

	}

	public void main(String[] args) {
		int num = 4;
		Test6 test6 = new Test6();

//		callByValue(num) 을 호출하는 문장을 작성
		System.out.println("callByValue() 메서드 호출 전 : " + num);

		test6.callByValue(num);
		System.out.println("callByValue() 메서드 호출 후 : " + num);

//      Time 클래스 배열을 입력으로 callByReference() 메서드를 호출하는 문장을 작성
		Time[] arr = {new Time(), new Time(), new Time()};
		// 선언, 생성, 초기화 1문장으로

		arr[0].hour = 10;
		arr[0].minute = 30;
		arr[0].second = 40;

		arr[1].hour = 2;
		arr[1].minute = 20;
		arr[1].second = 30;

		arr[2].hour = 5;
		arr[2].minute = 30;
		arr[2].second = 55;

		test6.callByReference(arr);

		System.out.println("callByReference() 메서드 호출 전 : ");

		for (Time time : arr) {
			System.out.println(time.getCurrentTime());
		}
	}
}
