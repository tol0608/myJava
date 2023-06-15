package chap7.terran;

public abstract class Unit {
	int hitPoint;
	final int MAX_HP;

	public Unit(int hp) {
		MAX_HP = hp;
	}
}
