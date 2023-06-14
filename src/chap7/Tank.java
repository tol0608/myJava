package chap7;

public class Tank extends Unit{
	Tank(int x, int y) {
		super(x, y);
	}
	void move(int x, int y) {
		System.out.println("탱크 " + x + " , " + y + "로 이동");
	}
	void sigemode(){
		System.out.println("시즈모드");
	}
}
