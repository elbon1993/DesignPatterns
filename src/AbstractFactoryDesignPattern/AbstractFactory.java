package AbstractFactoryDesignPattern;

public interface AbstractFactory {
	
	public Device getGadget(DeviceType deviceType);
}
