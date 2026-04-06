package weeklyAssignment;

import java.util.Arrays;

public class Week3_Problem2_isSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 500000, 780, 3, 11, 2 };
		System.out.println(Arrays.toString(arr));

		int[] org_arr = arr.clone();
		System.out.println(Arrays.toString(org_arr));

		int start = arr[0];
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					start = arr[i];

					arr[i] = arr[i + 1];
					arr[i + 1] = start;

				}
			}
			// to check if the array is sorted

			System.out.println(Arrays.toString(arr));
		}

	}
}
