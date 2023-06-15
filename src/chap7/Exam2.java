package chap7;
// 다음의 배열을 이용하여 중복되지 않는 로또 번호 6개를 생성하여 크기 순서대로 출력하는 코드를 작성
// 단, 객체지향적으로 코드를 작성

// int [] lotto = new int[6];
public class Exam2 {
	public static void main(String[] args) {
		MyLotto lotto = new MyLotto();
		System.out.println("로또 번호 : " + lotto.toString());
	}
}
