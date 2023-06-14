package chap7;

public class Ex14 {
	public static void main(String[] args) {
		Car myCar = new Car();

		try {
			FireEngine fire = (FireEngine) myCar;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		// ClassCastException 발생
	}
}
