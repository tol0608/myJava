package chap4;

/*
[월의 마지막일자 계산 프로그램]
사용자에게 년도와 월을 입력 받아 해당 월의 마지막 일자를 출력하는 코드를 작성하세요.

[실행 결과1]
년도와 월을 입력하세요 : 2023 1
2023년 1월의 마지막 일자는 31일 입니다

[실행 결과2]
년도와 월을 입력하세요 : 2020 2
2020년 2월의 마지막 일자는 29일 입니다

[마지막 일자 알고리즘]
1. 큰달 : 1, 3, 5, 7, 8, 10, 12 => 31일
2. 작은달: 4, 6, 9, 11 => 30일
3. 2월: 윤년 29일, 평년 28일
*/

import java.util.Scanner;

public class Exam4 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("년도랑 월을 입력하삼요 : ");
//        int year = sc.nextInt();
//        int month = sc.nextInt();
//        int date = sc.nextInt();
//
//
//        switch (month) {
//            case 12:
//                date = 31;
//                break;
//            case 11:
//                date = 30;
//                break;
//            case 10:
//                date = 31;
//                break;
//            case 9:
//                date = 30;
//                break;
//            case 8:
//                date = 31;
//                break;
//            case 7:
//                date = 31;
//                break;
//            case 6:
//                date = 30;
//                break;
//            case 5:
//                date = 31;
//                break;
//            case 4:
//                date = 30;
//                break;
//            case 3:
//                date = 31;
//                break;
//            case 2:
//                if (year % 4 == 0) {
//                    if (year % 100 == 0) {
//                        if (year % 400 == 0) {
//                            date = 29;
//                        } else {
//                            date = 28;
//                        }
//                    } else {
//                        date = 29;
//                    }
//                } else {
//                    date = 28;
//                }
//                break;
//            case 1:
//                date = 31;
//                break;
//        }
//        sc.close();
//        System.out.println(year + " 년 " + month + " 월 의 마지막 일자는 " + date + " 입니다.");
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도랑 월을 입력하삼요: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = 0;

        switch (month) {
            case 12:
                date = 31;
                break;
            case 11:
                date = 30;
                break;
            case 10:
                date = 31;
                break;
            case 9:
                date = 30;
                break;
            case 8:
                date = 31;
                break;
            case 7:
                date = 31;
                break;
            case 6:
                date = 30;
                break;
            case 5:
                date = 31;
                break;
            case 4:
                date = 30;
                break;
            case 3:
                date = 31;
                break;
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    date = 29;
                } else {
                    date = 28;
                }
                break;
            default:
                date = 31;
                break;
        }

//        int year, month, lastDay = 31;
//
//        System.out.print("년도랑 월을 입력해보삼요");
//        year = sc.nextInt();
//        month = sc.nextInt();
//        sc.close();
//
//        switch (month) {
//            case 4: case 6: case 9: case 11:
//                lastDay = 30;
//                break;
//            case 2:
//                if ((year % 4 == 0 && year % 100 !== 0) || (year % 400 == 0)) {
//                    lastDay = 29;
//                } else {
//                    lastDay = 28;
//                }
//        }

        System.out.println(year + "년 " + month + "월 의 마지막 일자는 " + date + "일임");
    }
}

