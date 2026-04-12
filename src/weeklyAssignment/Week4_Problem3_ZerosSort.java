package weeklyAssignment;

import java.util.Arrays;

public class Week4_Problem3_ZerosSort {
	public static void main(String[] args) {
		int[] a = { 0, 0, 3, 0, 5, 10000, 0, 0, 0 };
		int start = a[1];
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] == 0) {
					start = a[j];

					a[j] = a[j + 1];
					a[j + 1] = start;
//					System.out.println(a[j]);
//					System.out.println(a[j + 1]);

				}
			}

		}
		System.out.println(Arrays.toString(a));
	}

}
