package FactoryPattern;

import AbstractFactoryDesignPattern.Device;
import AbstractFactoryDesignPattern.DeviceType;
import AbstractFactoryDesignPattern.devices.Oneplus;

public class FactoryGenerator {

	public static Device getDevice(DeviceType deviceType) {
		switch (deviceType) {
		case ONEPLUS:
			return new Oneplus("16GB", "Qualcomm");
		default:
			return null;
		}

	}
}
