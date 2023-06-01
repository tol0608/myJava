package chap3;

public class Ex2 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 4, result;

        result = 7 + (~num2 + 1);
        System.out.printf("%d + %d = %d \n", num1, num2, result);
    }
}
