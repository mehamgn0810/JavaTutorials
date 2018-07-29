package exercises;

public class PrintWithoutMain {
	
	/*
	 * Without main method we cannot run a program. So place print statement in static block
	 * and leave main method as empty
	 */
	
	static {
		System.out.println("Inside static block");
		System.exit(0);
	}

	public static void main(String[] args) {

	}

}
