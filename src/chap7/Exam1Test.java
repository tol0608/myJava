//package chap7;
//
//import chap6.Exam1;
//
//public class Exam1Test {
//	int year, month, day, num, count;
//
//	int[] lastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 배열을 맞추기 위해서 -1 추가함
//	String[] week = {"일", "월", "화", "수", "목", "금", "토"}; // 문자열 = string
//
//	Exam1Test () {
//
//	}
//
//	Exam1Test(int num) {
//		this.num = num;
//	}
//
//	void setNum(int i) { this.num = i;} // 유효한 실수값을 num에 저장
//
//	for (int j = 1; j <= year - 1; j++) {
//		if (j % 4 == 0 && j % 100 != 0 || j % 400 == 0) {
//			// 윤년
//			count += 366;
//		} else {
//			// 평년
//			count += 365;
//		}
//	}
//
//	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//		lastDays[2] = 29;
//	}
//		for (int i = 1; i <= month - 1; i++) {
//		count += lastDays[i];
//	}
//		count += day;
//}
