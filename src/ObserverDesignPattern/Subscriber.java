package ObserverDesignPattern;

public class Subscriber {

	String name;
	Channel channel;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void uploaded(String videoTitle) {
		System.out.println("Hi "+name+", new video uploaded by "+channel.getName()+" ("+videoTitle+")");
	}

	public String getName() {
		return name;
	}
	
	public void subscribeToChannel(Channel channel) {
		this.channel = channel;
	}
	
}
