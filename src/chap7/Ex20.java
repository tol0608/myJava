package chap7;

import oop.Time;

public class Ex20 {
	// 유닛의 모든 기능을 수행하는 메서드
	void play(Unit unit) {
		unit.move(unit.x, unit.y);

		if (unit instanceof Marine) {
			Marine marine = (Marine) unit;
			marine.stimpack();
		}
		else if (unit instanceof Tank) {
			Tank tank = (Tank) unit;
			tank.sigemode();
		}
		else if (unit instanceof Dropship) {
			Dropship dropship =(Dropship) unit;
			dropship.load();
			dropship.unload();
		}
	}

	public static void main(String[] args) {
		Unit[] units = new Unit[4];

		units[0] = new Marine(10, 20);
		units[1] = new Tank(30, 40);
		units[2] = new Dropship(20, 35);
		units[3] = new Marine(28, 12);

		//play 메서드를 이용해 모든 유닛을 이용하는 코드를 입력
		Ex20 ex20 = new Ex20();
		for (Unit unit : units) {
			ex20.play(unit);
		}


	}
}
