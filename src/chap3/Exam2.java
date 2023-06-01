package chap3;

/*
    [ 동전 교환 프로그램 ]

    다음의 실행 결과와 같은 프로그램을 작성하세요.

    실행 결과 :

    계산하실 금액을 입력하세요 : 10000
    구매하신 금액을 입력하세요 : 6234

    거스름 돈 : 3766원
    500원 짜리 동전 : 7개
    100원 짜리 동전 : 2개
    50원 짜리 동전 : 1개
    10원 짜리 동전 : 1개
    나머지 거스름돈 : 6원

    [코드 작성 조건]
    1. 여러 개의 변수를 이용하여 문제를 해결
    2. 하나의 변수를 이용하여 문제를 해결
 */

import java.util.Scanner;

public class Exam2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] change = {500, 100, 50, 10, 1};
//        int pay, buy;
//
//        System.out.print("계산하실 금액을 입력하세여");
//        pay = sc.nextInt();
//        System.out.print("구매하신 금액을 입력하세여");
//        buy = sc.nextInt();
//        sc.close();
//
//        System.out.println("거스름 돈 : " + (pay - buy));
//        pay = (pay - buy);
//        System.out.println(" 500 원 : " + (pay / 500) + "개 ");
//        pay = (pay - (pay / 500) * 500);
//        System.out.println(" 100 원 : " + (pay / 100) + "개 ");
//        pay = (pay - (pay / 100) * 100);
//        System.out.println(" 50 원 : " + (pay / 50) + "개 ");
//        pay = (pay - (pay / 50) * 50);
//        System.out.println(" 10 원 : " + (pay / 10) + "개 ");
//        pay = (pay - (pay / 10) * 10);
//        System.out.println(" 1 원 : " + (pay / 1) + "개 ");

//        Scanner sc = new Scanner(System.in);
//        int money;
//
//        System.out.print("계산하실 금액을 입력하세여");
//        money = sc.nextInt();
//        System.out.print("구매하신 금액을 입력하세여");
//        money -= sc.nextInt();
//        sc.close();
//
//        System.out.printf("거스름 돈 : %d원\n", money);
//        System.out.printf("500원 짜리 동전 : %d개\n", money / 500);
//
//        money %= 500;
//        System.out.printf("100원 짜리 동전 : %d개\n", money / 100);
//
//        money %= 100;
//        System.out.printf("50원 짜리 동전 : %d개\n", money / 50);
//
//        money %= 50;
//        System.out.printf("10원 짜리 동전 : %d개\n", money / 10);
//
//        money %= 10;
//        System.out.printf("1원 짜리 동전 : %d개", money / 1);





public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int money;

    System.out.print("구매하신 금액을 입력하삼요");
    money = sc.nextInt();
    System.out.print("낸돈을 입력하삼요");
    money -= sc.nextInt();
    sc.close();

    System.out.printf("거스름돈 : %d\n", money);
    System.out.printf("500원 : %d 개\n", money / 500);
    money %= 500;

    System.out.printf("100원 : %d 개\n", money / 100);
    money %= 100;

    System.out.printf("50원 : %d 개\n", money / 50);
    money %= 50;

    System.out.printf("10원 : %d 개\n", money / 10);
    money %= 10;

    System.out.printf("1원 : %d 개\n", money / 1);
}
    }













