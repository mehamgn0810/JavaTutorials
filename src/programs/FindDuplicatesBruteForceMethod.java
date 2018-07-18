package programs;

import java.util.ArrayList;

public class FindDuplicatesBruteForceMethod {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 2, 4, 4, 5, 5, 6, 7 };

		ArrayList<Integer> dup = new ArrayList<Integer>();
		ArrayList<Integer> nonDup = new ArrayList<Integer>();

		int flag;

		for (int i = 0; i < a.length; i++) {
			flag = 0;
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					if (a[i] == a[j]) {
						if (!dup.contains(a[j])) {
							dup.add(a[j]);
							flag = 1;
						}else {
							flag = 1;
						}
					}
				}
			}
			if (flag == 0) {
				nonDup.add(a[i]);
			}
		}

		System.out.println("Duplicated Values: " + dup);
		System.out.println("Non-Duplicated Values: " + nonDup);
	}

}
