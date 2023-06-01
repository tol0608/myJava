package chap5;

public class Ex10 {
	public static void main(String[] args) {
		char[] arr1 = {'0', '1', '2', '3', '4'};
		char[] arr2 = {'a', 'b', 'c', 'd', 'e'};

		System.arraycopy(arr1, 1,arr2, 2, 2);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + "  ");
		}
	}
}
