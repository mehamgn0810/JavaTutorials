package understandingclasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) throws IOException {
		
		List<Integer> l = new ArrayList<Integer>(20);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		System.out.println(l);
		
		l.add(0, 0);
		
		System.out.println(l);
		
		System.out.println("==============================================");
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		
		System.out.println(l1);
		
		l.addAll(2,l1);
		
		System.out.println(l.set(2, 123));	
		
		
	}

}
