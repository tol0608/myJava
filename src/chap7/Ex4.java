package chap7;

public class Ex4 {
	public static void main(String[] args) {
		Child child = new Child("손흥민", "남자");
		child.methodA();
		System.out.println(child.name + " : " + child.gender);
	}
}
