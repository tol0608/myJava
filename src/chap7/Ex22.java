package chap7;

public class Ex22 implements YourInterface {
	public void abstratMethod() {
		System.out.println("abstratMethod()");
	}

	public static void main(String[] args) {
		Ex22 ex22 = new Ex22();

		YourInterface your = new Ex22();

//		System.out.println("num : " + ex22.num);
		System.out.println("num : " + YourInterface.num);

//		ex22.staticMethod();
		YourInterface.staticMethod();

//		ex22.abstractMethod();
		your.defaultMethod();

//		ex22.abstratMethod();
		your.abstractMethod();
	}

	@Override
	public void abstractMethod() {

	}
}
