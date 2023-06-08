package chap6;

public class Ex10 {
	int sum(int num) {
		if (num == 1) {
			return 1;
		}
		return num + sum(num - 1);
	}

	public static void main(String[] args) {

//		int total = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			total += i;
//		}
		Ex10 ex10 = new Ex10();
		System.out.println("total : " + ex10.sum(10));
	}
}
