package chap5;

import org.jetbrains.annotations.NotNull;

public class Ex11 {
	public static void main(String [] args) {
		System.out.println("args 배열의 크기 : " + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
