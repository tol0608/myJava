package chap4;

public class Ex7 {
    public static void main(String[] args) {
        int i, total = 0;

        for (i = 1; i <= 10; i++) {
            total += i;

            System.out.println("i : " + i + " total : " + total);
        }
        System.out.println("[for 반복문 이후] i : " + i);
    }
}
