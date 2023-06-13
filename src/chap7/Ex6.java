package chap7;
import chap7.packageB.Child;
public class Ex6 {
	public static void main(String[] args) {
		//chap7.packageB.Child클래스의 인스턴스를 생성하고 result 값을 출력하는 코드
		//안되면 문제 찾고 해결하기

		Child child = new Child(10,20,30,40);

		System.out.println(child.getResult1());
	}
}
