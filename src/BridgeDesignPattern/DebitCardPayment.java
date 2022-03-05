package BridgeDesignPattern;

public class DebitCardPayment implements IPaymentType {

	@Override
	public String paymentType() {
		return "Debit card";
	}

}
