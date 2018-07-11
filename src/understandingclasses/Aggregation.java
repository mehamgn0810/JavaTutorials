package understandingclasses;

public class Aggregation {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("Bike", 2012);
		Vehicle v2 = new Vehicle("Car", 2015);
		
		
		Person p1 = new Person(v1);
		Person p2 = new Person(v2);
		
		v1.start();
		p1.startVehicle();
		
		System.out.println("===============================");
		p1 = null;
		
		v1.start();
		p1.startVehicle();
	}
}

class Vehicle {

	private String type;
	private int year;

	public Vehicle(String type, int year) {
		this.type = type;
		this.year = year;
	}
	
	public void start() {
		System.out.println("Vehicle started.....");
	}

}

class Person {

	private Vehicle vehicle;

	Person(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void startVehicle() {
		vehicle.start();
	}
}