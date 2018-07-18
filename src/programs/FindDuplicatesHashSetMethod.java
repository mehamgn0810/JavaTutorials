package programs;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesHashSetMethod {
	
	public static void main(String[] args) {
		
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		
		Set<String> set = new HashSet<String>();
		
		for (String item: strArray) {
			if(!set.add(item)) {
				System.out.println("Duplicate value: " + item);
			}
		}
	}

}
