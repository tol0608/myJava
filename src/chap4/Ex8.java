package chap4;

public class Ex8 {
    public static void main(String[] args) {
        // 1 부터 100 사이의 모든 홀수의 값을 더하여 그 결과를 출력하는 코드
        int i, total = 0;

//        for 반복문만 사용하여 해결

        for (i = 1; i <= 100; i += 2) {
            total += i;

            System.out.println("num : " + i);
        }
//        for 반복문안에 if 문을 사용하여 해결

//        for (i = 1; 1 <= 100; i++) {
//            if (1 % 100 != 0) {
//                total += i;
//            }
//        }
        System.out.println("total : " + total);
    }
}
