package oopconcepts;

/*
 * Static variable/method belongs only to class and not to the every instance/object
 * They are common for all objects
 * When a method uses static variable, the method must also be defined as static
 * While calling static field/method, call using class and not using object instance
 */


public class StaticDemo {

	public static void main(String[] args) {
		StaticExampleClass s1 = new StaticExampleClass("bmw");
		System.out.println("Make of Car is: " + s1.getMake());
		System.out.println("This is intance no: " + StaticExampleClass.getInstanceNum());
		
		StaticExampleClass s2 = new StaticExampleClass("benz");
		System.out.println("Make of Car is: " + s2.getMake());
		System.out.println("This is intance no: " + StaticExampleClass.getInstanceNum());
	}
}