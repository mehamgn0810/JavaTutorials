package automobile;

public class BMW extends Cars {

	public BMW(int startSpeed) {
		super(startSpeed);// calls Cars Constructor
	}

	/*
	 * shortcut to override parent class methods source --> Override/implement
	 * methods
	 */

	@Override
	public void increaseSpeed() {
		protectedSpeed++;
		Cars c1 = new Cars();
		c1.decreaseSpeed();
		System.out.println("Increasing Speed of BMW");
	}

	public void headupDisplayNavigation() {
		System.out.println("BMW Specific Functionality");
	}

	public void stop() {
		Cars c1 = new Cars();
		c1.decreaseSpeed();
	}
}
