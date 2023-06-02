package chap6;

public class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv();

		System.out.println("color : " + t.color);
		System.out.println("isPower : " + t.isPower);
		System.out.println("channel : " + t.channel);

		t.power();
		t.color="은색";
		t.channelUp();
		t.channelUp();
		t.channelUp();

		System.out.println("color : " + t.color);
		System.out.println("isPower : " + t.isPower);
		System.out.println("channel : " + t.channel);
	}
}
