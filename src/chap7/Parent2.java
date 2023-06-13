package chap7;

//public final class Parent2 {
public class Parent2 {
	String name;

	Parent2(String name) {
		this.name = name;
		System.out.println("Parent 인스턴스 생성");
	}

//	final void methodA() {
	void methodA() {
		System.out.println("Parent() 클래스의 methodA");
	}
}
