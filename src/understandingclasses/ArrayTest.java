package understandingclasses;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[5];
		
		arr[4] = 1;
		arr[3] = 2;
		arr[2] = 3;
		
		System.out.println(arr[4]);
		System.out.println(arr[0]);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr);
		
		Object[] arr1 = new Integer[5];
		arr1[0]= 1;
		arr1[1] = "string";//Array Store Exception
		System.out.println(Arrays.toString(arr1));
		
		//Without defining type
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("string");
		
		System.out.println(al);
		
	}

}
