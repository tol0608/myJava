package chap7.terran;

public class Marine extends GroundUnit {
	Marine() {
		super(40);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine";
	}
}
