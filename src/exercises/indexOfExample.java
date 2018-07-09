package exercises;

public class indexOfExample {

	public static void main(String[] args) {

		String str = "Bannanaas";
		String ch = "n";

		int index = str.indexOf(ch);

		while(index >= 0) {
		System.out.println(index);
		index = str.indexOf(ch, index + 1);
		}

//		for (int index = str.indexOf(ch); index >= 0; index = str.indexOf(ch, index + 1)) {
//			System.out.println(index);
//		}

	}

}