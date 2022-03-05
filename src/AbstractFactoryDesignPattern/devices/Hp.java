package AbstractFactoryDesignPattern.devices;

import AbstractFactoryDesignPattern.Device;

public class Hp implements Device {
	String ram;
	String processor;
	String gpu;
	
	public Hp(String ram, String processor, String gpu) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
	}

	@Override
	public String getDetails() {
		return "HP config:: RAM="+this.ram+" Processor="+this.processor+" GPU="+this.gpu;
	}

}
