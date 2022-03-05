package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.devices.Dell;
import AbstractFactoryDesignPattern.devices.Hp;

public class LaptopFactory implements AbstractFactory {

	@Override
	public Device getGadget(DeviceType deviceType) {
		switch (deviceType) {
		case DELL:
			return new Dell("8GB", "Qualcomm", "2GB");
		case HP:
			return new Hp("8GB", "Intel", "4GB");
		default:
			return null;
		}
	}

}
