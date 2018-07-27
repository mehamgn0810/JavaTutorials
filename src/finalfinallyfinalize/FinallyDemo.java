package finalfinallyfinalize;

public class FinallyDemo {
	
	//finally block will execute even exception occurs

	public static void main(String[] args) {
		test3();
	}
	
	public static void test1() {
		try {
			System.out.println("Inside test1");
		}
		finally {
			System.out.println("Inside Finally");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("Inside test1...");
			int x = 1/0;
			System.out.println(x);
		}catch(NullPointerException e) {
			System.out.println("Inside Catch");
		}
		finally {
			System.out.println("Inside Finally");
		}
	}
	
	public static void test3() {
		try {
			System.out.println("Inside test1");
			throw new RuntimeException();
		}catch(Exception e) {
			System.out.println("Inside Catch");
		}
		finally {
			System.out.println("Inside Finally");
		}
	}

}
