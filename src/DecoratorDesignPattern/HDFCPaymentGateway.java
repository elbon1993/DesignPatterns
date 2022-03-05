package DecoratorDesignPattern;

public class HDFCPaymentGateway implements IPaymentGateway {

	@Override
	public String getName() {
		return "HDFC Payments Gateway";
	}

}
