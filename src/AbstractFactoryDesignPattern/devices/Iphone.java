package AbstractFactoryDesignPattern.devices;

import AbstractFactoryDesignPattern.Device;

public class Iphone implements Device {
	String ram;
	String processor;
	
	public Iphone(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "HP config:: RAM="+this.ram+" Processor="+this.processor;
	}

}
