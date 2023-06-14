package chap7;

public class Marine extends Unit{
	Marine(int x, int y) {
		super(x, y);
	}
	void move(int x, int y) {
		System.out.println("마린이 " + x + " , " + y + "로 이동");
	}
	void stimpack(){
		System.out.println("마린이 미쳤어요");
	}
}
