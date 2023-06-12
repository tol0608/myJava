package oop;

public class Time {
	int hour;
	int minute;
	int second;

	String getCurrentTime() {
		return this.hour + "시" + this.minute + "분" + this.second + "초";
	}
}
