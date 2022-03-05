package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	String name;
	
	List<Subscriber> subscribers = new ArrayList<>();

	
	public Channel(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void subcribeToChannel(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	public void sendNotification(String title) {
		for(Subscriber subscriber: subscribers) {
			subscriber.uploaded(title);
		}
	}
}
