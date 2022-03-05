package FactoryPattern;

import AbstractFactoryDesignPattern.Device;
import AbstractFactoryDesignPattern.DeviceType;

public class Client {

	public static void main(String[] args) {
		Device onePlus = FactoryGenerator.getDevice(DeviceType.ONEPLUS);
		System.out.println(onePlus.getDetails());
	}
}
