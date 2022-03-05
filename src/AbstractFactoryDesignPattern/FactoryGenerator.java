package AbstractFactoryDesignPattern;

public class FactoryGenerator {

	public static AbstractFactory getFactory(FactoryType factoryType) {
		switch (factoryType) {
		case MOBILE_FACTORY:
			return new MobileFactory();
		case LAPTOP_FACTORY:
			return new LaptopFactory();
		default:
			return null;
		}
	}
}
