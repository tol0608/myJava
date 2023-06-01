package chap3;

public class Ex5 {
    public static void main(String[] args){
        int num1 =6, num2 =4, result; // num1: 0110, num2: 0100
        boolean bool1 = false, bool2 = true, bResult;

//        result = num1 & num2; // &: Bit And Operator, result: 0100 => 4
//        System.out.println("result : " + result);
//
//        bResult = bool1 & bool2; // &: Logical And Operator
//        System.out.println("bResult : " + bResult);

        result = num1 | num2; // |: Bit Or Operator, result: 0100 => 6
        System.out.println("result : " + result);

        bResult = bool1 | bool2; // |: Logical Or Operator
        System.out.println("bResult : " + bResult);
    }
}
