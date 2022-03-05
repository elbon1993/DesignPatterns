package DecoratorDesignPattern;

public class Client {
	public static void main(String[] args) {
		System.out.println(new PaymentGatewayWrapper(new HDFCPaymentGateway()).getName());
	}
}
