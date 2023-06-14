package chap7;

public class Ex15 {
	public static void main(String[] args) {
		Car myCar = new FireEngine();

		myCar.drive();
		myCar.stop();
//		myCar.water();

		FireEngine fire = (FireEngine) myCar;
		fire.water();
	}
}
