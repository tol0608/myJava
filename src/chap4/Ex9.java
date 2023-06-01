package chap4;

public class Ex9 {
    public static void main(String[] args) {
        // 1부터 100사이의 값 중 홀수의 합과 짝수의 합을 동시에 구하여 그 결과를 출력하는 코드
        int i, j, fir =0 , sec = 0;

        for (i = 1, j = 2; i <= 100 && j <= 100; i += 2, j += 2 ) {
            fir += i;
            sec += j;
        }
        System.out.println("홀수 : " + fir);
        System.out.println("짝수 : " + sec);
    }
}
