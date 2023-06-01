package chap5;

public class Ex1 {
	public static void main(String[] args) {
		int[] score;
		score = new int[5];

		System.out.printf("%d %d %d %d %d \n",score[0],score[1],score[2],score[3],score[4]);

		score[0] = 95;
		score[1] = 90;
		score[2] = 85;
		score[3] = 100;
		score[4] = 75;

		System.out.printf("%d %d %d %d %d \n",score[0],score[1],score[2],score[3],score[4]);
	}
}
