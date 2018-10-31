package programs;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(6));

	}

	static int factorial(int number) {

		if (number == 0 || number == 1) {
			return 1;
		}
		return (number * factorial(number - 1));

	}

}
