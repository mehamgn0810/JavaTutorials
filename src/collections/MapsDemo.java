package collections;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		// Stores in pair, key -> value : Entry
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "BMW");
		map.put(6, "Audi");
		map.put(4, "Honda");
		map.put(null, "Hero");
		
		String value1 = map.get(1);
		System.out.println(value1);
		
		// Keys are unique, value can be duplicated
		map.put(2, "BMW");
		map.put(4, "Merc");
		String value2 = map.get(4);
		System.out.println(value2);
		
		System.out.println(map.get(null));
	}
}