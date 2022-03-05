package BridgeDesignPattern;

public class HDFCPaymentGateway implements IPaymentGateway{

	@Override
	public void processPayment(IPaymentType paymentType) {
		System.out.println("HDFC bank payment gateway processed your payment through "+ paymentType.paymentType());
	}

}
