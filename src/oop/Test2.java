package oop;

public class Test2 {
	public static void main(String[] args) {
		Time time;
		time = new Time();

		System.out.println(time.getCurrentTime());

		time.hour = 10;
		time.minute = 38;
		time.second = 40;

		System.out.println(time.getCurrentTime());
	}
}
