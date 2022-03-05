package AbstractFactoryDesignPattern.devices;

import AbstractFactoryDesignPattern.Device;

public class Oneplus implements Device {
	String ram;
	String processor;
	
	public Oneplus(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "ONEPLUS config:: "+this.ram+" Processor="+this.processor;
	}

}
