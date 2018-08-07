package programs;

public class PrintTree {

	public static void main(String[] args) {

		int n = 50;
		int space = n - 2;

		for (int i = 1; i <= n; i++) {
			for (int j = space; j >= 0; j--) {
				System.out.print(" ");
			}
			space--;
			for (int k = 0; k < i; k++) {
				System.out.print("X" + " ");
			}
			System.out.println();
		}

	}

}
