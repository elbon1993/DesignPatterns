package BridgeDesignPattern;

public class CitiPaymentGateway implements IPaymentGateway {

	@Override
	public void processPayment(IPaymentType paymentType) {
		System.out.println("Citi bank payment gateway processed your payment through "+ paymentType.paymentType());
	}

}
