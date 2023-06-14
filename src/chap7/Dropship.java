package chap7;

public class Dropship extends Unit{
	Dropship(int x, int y) {
		super(x, y);
	}
	void move(int x, int y) {
		System.out.println("드랍쉽이 " + x + " , " + y + "로 이동");
	}
	void load(){
		System.out.println("야 타");
	}
	void unload(){
		System.out.println("내리삼");
	}
}
