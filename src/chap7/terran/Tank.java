package chap7.terran;

public class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
}
