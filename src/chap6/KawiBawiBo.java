package chap6;

public class KawiBawiBo {
	int user;
	int com;
	String[] kbb;

	KawiBawiBo() {
		this.kbb = new String[]{"가위", "바위", "보"};
	}

	KawiBawiBo(int user) {
		this();
		this.setUser(user);
		this.setCom(com);
	}

	void setUser(int user) {
		this.user = user - 1;
	}

	void setCom(int com) {
		this.com = (int) (Math.random() * 3);
	}

	String getUser() {
		return this.kbb[this.user];
	}

	String getCom() {
		return this.kbb[this.com];
	}

	String judge() {
		String result = "";

		switch (this.user - this.com) {

			case 0:
				result = "비김";
				break;
			case 1:
			case -2:
				result = "이김 v";
				break;
			case -1:
			case 2:
				result = "짐";
				break;
		}
		return result;
	}
}
