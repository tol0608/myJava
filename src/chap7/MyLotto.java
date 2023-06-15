package chap7;

public class MyLotto {
	private int[] lotto;

	public MyLotto() {
		this.lotto = new int[6];
		this.setLotto();
		this.sortLotto();
	}

	// 로또 번호 중복 검사 메서드
	private boolean isUnique(int num) {
		boolean result = true;

		for (int i = 0; i < this.lotto.length; i++) {
			if (this.lotto[i] == num) {
				result = false;
				break;
			}
		}

		return result;
	}

	// 로또 배열 초기화 메서드
	void setLotto() {
		int temp;

		for (int i = 0; i < this.lotto.length; ) {
			while (true) {
				temp = (int) (Math.random() * 45) + 1;
				if (this.isUnique(temp)) {
					lotto[i] = temp;
					i++;
					break;
				}
			}
		}
	}

	void sortLotto() {
		int temp;

		for (int i = 0; i < this.lotto.length - 1; i++) {
			for (int j = i + 1; j < this.lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}
	int[] getLotto(){
		return lotto;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int num : lotto) {
			sb.append(num).append(" ");
		}
		return sb.toString();
	}
}
