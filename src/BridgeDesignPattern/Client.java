package BridgeDesignPattern;

public class Client {
	public static void main(String[] args) {
		new HDFCPaymentGateway().processPayment(new OnlineBankingPayment());
	}
}
