package chap7;

public interface YourInterface {
	int num = 1234;

	static void staticMethod() {
		System.out.println("staticMethod()");
	}

	default void defaultMethod() {
		System.out.println("defaultMethod()");
	}

	void abstractMethod();
}
