package understandingclasses;

public class Composition{
	
	Species human = new Species(2, 1);
	Species octopus = new Species(6, 3);
	
	organs.
}

class Organs{

	private int legs;
	private int heart;
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getLegs() {
		return this.legs;
	}
	
	public void setHeart(int heart) {
		this.heart = heart;
	}
	
	public int getHeart() {
		return this.heart;
	}
}

class Species{
	private Organs organs;
	
	public Species(int noOfLegs, int noOfHeart) {
		organs.setLegs(noOfLegs);
		organs.setHeart(noOfHeart);
	}
	
	public int getLegs() {
		return organs.getLegs();
	}
	
	public int getHeart() {
		return organs.getHeart();
	}
}