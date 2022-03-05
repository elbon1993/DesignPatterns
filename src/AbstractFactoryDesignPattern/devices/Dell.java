package AbstractFactoryDesignPattern.devices;

import AbstractFactoryDesignPattern.Device;

public class Dell implements Device {
	String ram;
	String processor;
	String gpu;
	
	public Dell(String ram, String processor, String gpu) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
	}

	@Override
	public String getDetails() {
		return "Dell config:: RAM="+this.ram+" Processor="+this.processor+" GPU="+this.gpu;
	}

}
