package BridgeDesignPattern;

public interface IPaymentGateway {
	void processPayment(IPaymentType paymentType);
}
