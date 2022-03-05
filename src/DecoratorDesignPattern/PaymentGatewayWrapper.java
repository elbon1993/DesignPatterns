package DecoratorDesignPattern;

public class PaymentGatewayWrapper implements AddOnDecorator {

	IPaymentGateway paymentGateway;
	
	public PaymentGatewayWrapper(IPaymentGateway paymentGateway) {
		super();
		this.paymentGateway = paymentGateway;
	}

	public String getName() {
		return this.paymentGateway.getName();
	}

}
