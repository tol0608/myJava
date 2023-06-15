package chap7;

public class ImplClass implements ChildInterface, MyInterface {
	public void methodA() {
		System.out.println("methodA()");
	} //public을 반드시 붙여야함
	public void methodB() {
		System.out.println("methodB()");
	}
	public void methodC() {
		System.out.println("methodC()");
	}
	public void methodD() {
		System.out.println("methodD()");
	}

}
