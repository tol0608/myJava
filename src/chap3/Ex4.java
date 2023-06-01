package chap3;

public class Ex4 {
    public static void main(String[] args) {
        int num1 = 1000000, num2 = 2000000;
        long result;

        result = (long)num1 * num2; // 둘중하나만 long타입으로 변환
        System.out.println("result : " + result);
    }
}
