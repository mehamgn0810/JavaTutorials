package exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToListToSet {

	public static void main(String[] args) {

//		Set<String> set = new HashSet<String>();
//		set.add("ab");
//		set.add("cd");
//		set.add("ef");
//		set.add("gh");
//		set.add("ij");
//
//		List<String> list = new ArrayList<String>(set);
//		System.out.println(list);
		
		List<String> list = new ArrayList<String>();
		list.add("ab");
		list.add("cd");
		list.add("ef");
		list.add("gh");
		list.add("ij");
		list.add("ab");
		list.add("cd");
		
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
	}
}
