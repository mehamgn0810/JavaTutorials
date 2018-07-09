package oopconcepts;

import automobile.BMW;
import automobile.Cars;

public class InheritanceDemo {

	
	public static void main(String[] args) {
		
		int speed = 0;
		
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		
		BMW b1 = new BMW(speed);
		b1.increaseSpeed();
		b1.headupDisplayNavigation();

	}

}
