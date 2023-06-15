package chap7;

public class MyCalendar {
	private int year;
	private int month;
	private int day;

	public MyCalendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// 윤년 판단 메서드
	private boolean isleapYear() {
		return this.isleapYear(this.year);
	}

	private boolean isleapYear(int year) {
		boolean result = false;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			result = true;
		}

		return result;
	}

	// 각 월의 마지막 일자를 반환하는 메서드
	private int getMonthLastDay(int month) {
		int[] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if (this.isleapYear()) {
			monthLastDays[2] = 29;
		}
		return monthLastDays[month];
	}

	// 서기 1년 1월 1일 부터 사용자가 입력하는 날짜까지의 전체 총 일수 반환
	public int getTotalDays() {
		int totalDays = 0;

		for (int i = 1; i < this.year; i++) {
			if (this.isleapYear(i)) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}
		}

		for (int i = 1; i < this.month; i++) {
			totalDays += this.getMonthLastDay(i);
		}
		totalDays += this.day;

		return totalDays;
	}

	public String getDayOfWeek () {
		String[] dayOfWeek = {"일", "월","화","수","목","금","토",};

		return  dayOfWeek[this.getTotalDays() % 7];
	}
}
