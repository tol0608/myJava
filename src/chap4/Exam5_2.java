package chap4;

import java.util.Scanner;
public class Exam5_2 {
    public static void main(String[] args) {
        // 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 선택하삼요:");
        int userChoice = scanner.nextInt();

        // 컴퓨터 선택 (랜덤)
        int computerChoice = (int) (Math.random() * 3) + 1;

        // 결과 출력
        System.out.println("너: " + convertToChoice(userChoice));
        System.out.println("콤퓨타: " + convertToChoice(computerChoice));
        System.out.println("결과: " + determineWinner(userChoice, computerChoice));
    }

    // 선택된 숫자를 가위, 바위, 보로 변환하는 함수
    public static String convertToChoice(int choice) {
        switch (choice) {
            case 1:
                return "가위";
            case 2:
                return "바위";
            case 3:
                return "보";
            default:
                return "잘못된 선택";
        }
    }

    // 승자를 결정하는 함수
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "무승부";
        } else if ((userChoice == 1 && computerChoice == 3)
                || (userChoice == 2 && computerChoice == 1)
                || (userChoice == 3 && computerChoice == 2)) {
            return "너의 승리다";
        } else {
            return "콤퓨타 성리";
        }
    }

}
