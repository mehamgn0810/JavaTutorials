package automobile;

/*
 * Abstract class may or may not have abstract methods
 * if any one method is abstract, that class must be defined as abstract
 * Abstract class cannot be instantiated
 * Abstract class can be inherited and instantiated
 * Inherited class must implement all the abstract methods
 */

public class AbstractDemoBMW extends AbstractCars {
	
	public void setPrivateSpeed(int speed) {
		super.setPrivateSpeed(10);
	}	

	@Override
	public void engineStart(String keyType, int numOfCyl) {
		System.out.println("This is the BMW engine start");
		System.out.println("Every child class may have different implementation");
	}
}