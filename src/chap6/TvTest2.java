package chap6;

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1, t2;
		t1 = new Tv();
		t2 = new Tv();

		System.out.println("[Tv1] color : " + t1.color);
		System.out.println("[Tv1] isPower : " + t1.isPower);
		System.out.println("[Tv1] channel : " + t1.channel);

		System.out.println("[Tv2] color : " + t2.color);
		System.out.println("[Tv2] isPower : " + t2.isPower);
		System.out.println("[Tv2] channel : " + t2.channel);

		System.out.println("t1 : " + t1 + ", t2 : " + t2);
		// Java 버츄얼 머신에 의해서 형성된, 해당 레퍼런스의 인스턴스 아이디가 표시됨
		System.out.println("===============================================");
		t2 = t1;

		t1.power();
		t2.color="은색";
		t1.channelUp();
		t2.channelUp();
		t1.channelUp();

		System.out.println("[Tv1] color : " + t1.color);
		System.out.println("[Tv1] isPower : " + t1.isPower);
		System.out.println("[Tv1] channel : " + t1.channel);

		System.out.println("[Tv2] color : " + t2.color);
		System.out.println("[Tv2] isPower : " + t2.isPower);
		System.out.println("[Tv2] channel : " + t2.channel);
		
		System.out.println("t1 : " + t1 + ", t2 : " + t2);

	}
}
