package chap4;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;

		System.out.print("문자열 입력 : ");
//		input = sc.next();
		input = sc.nextLine();
		sc.close();

		System.out.println();
		for (int i = 0; i <input.length(); i++) {
			System.out.println(input.charAt(i));
		}

	}
}
