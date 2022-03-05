package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.devices.Iphone;
import AbstractFactoryDesignPattern.devices.Oneplus;

public class MobileFactory implements AbstractFactory {

	@Override
	public Device getGadget(DeviceType deviceType) {
		switch (deviceType) {
		case IPHONE:
			return new Iphone("8GB", "iPhone Processor");
		case ONEPLUS:
			return new Oneplus("16GB", "Qualcomm");
		default:
			return null;
		}
	}

}
