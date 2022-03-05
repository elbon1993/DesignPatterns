package BridgeDesignPattern;

public class OnlineBankingPayment implements IPaymentType {

	@Override
	public String paymentType() {
		return "online banking";
	}

}
