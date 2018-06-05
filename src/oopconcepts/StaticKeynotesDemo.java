package oopconcepts;

public class StaticKeynotesDemo {
	
	/*
	 *  Static method cannot use the non-static variable or method directly
	 *  this and super cannot be used in static context
	 *  "this" keyword is always related to the instance/object
	 *  so it cannot be used in static context
	 *  
	 *  To use non-static variable/method in static method, 
	 *  create an instance of a class within the same static method and call using the object
	 *  
	 *  non-static variables cannot be called until an instance is created for that class
	 */
	 	
	public int addNum = 10;
	public static int addNumStatic = 10;

	public static void main(String[] args) {
		StaticKeynotesDemo s1 = new StaticKeynotesDemo();
		int output = s1.sum(20);
		int staticOutput = sumStatic(10);
		System.out.println("The output is: " + output);
		System.out.println("The output is: " + staticOutput);
	}
	
	public int sum(int num) {
		return num + addNum;
	}
	
	public static int sumStatic(int num) {
		return num + addNumStatic;
	}
}