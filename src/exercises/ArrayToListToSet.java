package exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayToListToSet {

	public static void main(String[] args) {
		
		int[] a = {1,2,2,3,4,4,5,5,6,7};
		
		Integer[] arr1 = Arrays.stream(a).boxed().toArray(Integer[]::new);
		Integer[] arr2 = IntStream.of(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(arr1);
		
		List<Integer> list1 = Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> list2 = IntStream.of(a).boxed().collect(Collectors.toList());
		
		Set<Integer> set = new HashSet<>(list1);
		
		System.out.println(set); //[1, 2, 3, 4, 5, 6, 7]
		
		Set<Integer> set1 = Arrays.stream(a).boxed().collect(Collectors.toSet());
		Set<Integer> set2 = IntStream.of(a).boxed().collect(Collectors.toSet());
		System.out.println(set2);
	}

}
