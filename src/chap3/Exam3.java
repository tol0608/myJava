package chap3;

//public class Exam3 {
//    public static void main (String[] args) {
//        int[] gugu = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//
//        System.out.println(gugu + " 단");
//        for (int i = 1; i <= 19; i++) {
//            System.out.println(gugu + " * " + i + " = " + (gugu * i));
//        }
//    }
//}
public class Exam3 {
    public static void main (String[] args) {
        int[] gugu = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int gugudan : gugu) {
            System.out.println(gugudan + " 단");
            for (int i = 1; i <= 19; i++) {
                System.out.println(gugudan + " * " + i + " = " + (gugudan * i));
            }
        }
    }
}

