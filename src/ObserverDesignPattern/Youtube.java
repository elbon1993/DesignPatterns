package ObserverDesignPattern;

public class Youtube {

	public static void main(String[] args) {
		
		Channel channel = new Channel("ADP");
		
		Subscriber subscriber1 = new Subscriber("chandu");
		Subscriber subscriber2 = new Subscriber("varam");
		Subscriber subscriber3 = new Subscriber("thrilokya");
		
		channel.subcribeToChannel(subscriber1);
		channel.subcribeToChannel(subscriber2);
		channel.subcribeToChannel(subscriber3);
		
		subscriber1.subscribeToChannel(channel);
		subscriber2.subscribeToChannel(channel);
		subscriber3.subscribeToChannel(channel);
		
		channel.sendNotification("How to learn programming?");
		
	}
}
