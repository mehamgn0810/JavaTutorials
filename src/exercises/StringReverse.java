package exercises;

public class StringReverse {

	public static void main(String[] args) {

		String str1 = "this is a test String";
		String output = reverseString(str1);
		System.out.println("Reverse of the String: " + output);
	}

	public static String reverseString(String str) {
		String reverse = "";

		if (str.length() <= 1) {
			reverse = str;
		} else {
			String[] strArray = str.split(" ");
			for (int i = strArray.length - 1; i >= 0; i--) {
				reverse = reverse + " " + strArray[i];
			}
		}
		reverse = reverse.trim();
		return reverse;
	}
}
