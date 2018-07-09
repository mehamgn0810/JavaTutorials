package exercises;

import java.util.Scanner;

public class CharReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to Reverse");
		String str = sc.nextLine();
		
//		if (str == null || str.isEmpty()) {
//			System.out.println("Given String is not valid");
//			str = sc.nextLine();
//		}
		
		while (str == null || str.isEmpty()) {
			System.out.println("Given String is not valid");
			str = sc.nextLine();
		}
		
		sc.close();
		String output = reverseChar(str);
		System.out.println("Reverse Character order for the String is: " + output);
	}

	public static String reverseChar(String str) {
		String reverse = "";
		
		

		if (str.length() <= 1) {
			reverse = str;
		} else {
			char[] charArray = str.toCharArray();
			for (char c : charArray) {
				reverse = c + reverse;
			}
		}
		return reverse.trim();

	}

}
