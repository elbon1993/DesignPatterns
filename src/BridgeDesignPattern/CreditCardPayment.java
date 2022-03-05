package BridgeDesignPattern;

public class CreditCardPayment implements IPaymentType {

	@Override
	public String paymentType() {
		return "Credit card";
	}

}
