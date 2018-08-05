package programs;

public class PrintCharacterIncrement {

	public static void main(String[] args) {
		
		String str = "PYTHON";
		String string = "";
		
		for(int i=0; i<str.length();i++) {
			
			char ch = str.charAt(i);
			string = string + ch;
			System.out.println(string);
		}
	}

}
