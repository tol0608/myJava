package chap7.packageA;

public class Parent {
	private int num1;
	int num2; // default
	protected int num3;
	public int num4;

	public Parent(int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	protected int getNum1(){
		return this.num1;
	} // 직접 num1에 접근할수는 없지만, protected로 간접적으로 접근가능

	public int getNum2() {
		return this.num2;
	} // 직접 num2에 접근할수는 없지만, public으로 간접적으로 접근가능
}
