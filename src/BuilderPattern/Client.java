package BuilderPattern;

public class Client {
	public static void main(String[] args) {
		Mobile mobile = new Mobile.MobileBuilder().os("Android").ram("4GB").build();
		System.out.println(mobile);
	}
}
