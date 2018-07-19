package programs;

public class OverloadMainMethod {

	public static void main(String[] args) {
		System.out.println("Main with AString[] args");
		/*
		 * main method with String[] args will be executed by JVM
		 * we must call other main methods to execute
		 */
		
//		main();
//		main("str");
//		main("int");
	}

	public static void main() {
		System.out.println("Main without arguments");
	}

	public static void main(String str) {
		System.out.println("Main with String arguments");
	}

	public static void main(int a) {
		System.out.println("Main with int arguments");
	}
}
