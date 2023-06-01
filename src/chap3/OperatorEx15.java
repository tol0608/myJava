package chap3;

class OperatorEx15 {
      public static void main(String[] args) { 
            char lowerCase = 'a'; 
            char upperCase = (char)(lowerCase - 32); // a:97, A:65 => 97 - 65 = 32

            System.out.println(upperCase); 
      } 
} 
