package chap7;

public class Ex21 {
	public static void main(String[] args) {
		ImplClass impl = new ImplClass();

		impl.methodA();
		impl.methodB();
		impl.methodC();
		impl.methodD();

		System.out.println("num : " + ChildInterface.num);
	}
}
