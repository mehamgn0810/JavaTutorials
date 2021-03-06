package automobile;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface {
	
	/*
	 * A class which implements an interface must implement all of its methods
	 * 
	 */

	@Override
	public void engineStart(String engineType, boolean isKeyLess) {
		System.out.println("This is the implementation");
	}

	@Override
	public void headsUpNavigation() {
		System.out.println("This is the headsup navigation");
	}
}