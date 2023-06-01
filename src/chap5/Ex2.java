package chap5;

public class Ex2 {
	public static void main(String[] args) {
		int[] arr1 = {90, 85, 70, 95, 80};

//		int[] arr2;
//		arr2 = {90, 85, 70, 95, 80};

		int[] arr3;
		arr3 = new int[] {5, 4, 3, 2, 1}; // []안에 크기를 명시할 수 없음

		int [] arr4 = new int[] {75, 85, 90, 35, 20};

		System.out.printf("%d %d %d %d %d \n", arr1[0], arr1[1], arr1[2], arr1[3], arr1[4]);
		System.out.printf("%d %d %d %d %d \n", arr3[0], arr3[1], arr3[2], arr3[3], arr3[4]);
		System.out.printf("%d %d %d %d %d \n", arr4[0], arr4[1], arr4[2], arr4[3], arr4[4]);
	}
}
