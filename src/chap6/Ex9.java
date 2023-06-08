package chap6;

public class Ex9 {
	void changeRefParam(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}

		System.out.println("changeRefParam() arr[] :  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.println("메서드 호출 전 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

		Ex9 ex9 = new Ex9();
		ex9.changeRefParam(arr);

		System.out.println("메서드 호출 후 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
}
