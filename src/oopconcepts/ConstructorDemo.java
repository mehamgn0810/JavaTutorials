package oopconcepts;;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		NewCar c1 = new NewCar();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("*********************");
		
		NewCar c2 = new NewCar(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}
}