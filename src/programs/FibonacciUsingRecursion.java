package programs;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		recursion(5);
	}

	static void recursion(int num) {
		if (num > 0) {
			System.out.println("x");
			num--;
			recursion(num);
		}

	}
}
