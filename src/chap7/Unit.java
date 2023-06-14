package chap7;

public abstract class Unit {
	int x, y;

	public Unit(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춰!");
	}
}
