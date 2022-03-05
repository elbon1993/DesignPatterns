package AbstractFactoryDesignPattern;

public class Client {
	public static void main(String[] args) {

		Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOP_FACTORY).getGadget(DeviceType.DELL);
		Device onePlus = FactoryGenerator.getFactory(FactoryType.MOBILE_FACTORY).getGadget(DeviceType.ONEPLUS);
		
		System.out.println(dell.getDetails());
		System.out.println(onePlus.getDetails());
	}
}
