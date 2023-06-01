package chap5;

public class Ex5 {
	public static void main(String[] args) {
		int[] ball = new int[45]; // 45칸

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1; // 45칸에 각각의 숫자를 순서대로 저장하는데 0번 칸에는 1이라고 저장함
		}

		int num = 0, j = 0; // 임시변수 초기화. num은 두 값을 바꿀 변수, j는 임시번호를 받아서 저장할 변수

		// 예제에서는 값이 잘 섞이도록 큰 반복횟수를 주는데, 차이가 있는지 확인 필요
		// 그리고 값을 왜 따로 저장해서 이중으로 출력을 해야하는지도 확인 필요
		for (int i = 0; i < 46; i++) {
			j = (int) (Math.random() * 45);
			num = ball[0];
			ball[0] = ball[j];
			ball[j] = num;
		}

		// 배열 앞에서부터 6개를 출력
		for (int i = 0; i < 6; i++ ) {
			System.out.print(ball[i] + "  ");
		}
	}
}
