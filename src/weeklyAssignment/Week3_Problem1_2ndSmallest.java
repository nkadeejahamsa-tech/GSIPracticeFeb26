package weeklyAssignment;

public class Week3_Problem1_2ndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int small =1;
		int[] arr = { 1, 2, 3, 4, 5, 6, 1 };
		int small = arr[0];
		int secSmall = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < small) {
				small = arr[i];
			}

		}
		System.out.println(small);
		for (int i = 0; i < arr.length; i++) {
//			secSmall = arr[0];

			if (arr[i] > small && arr[i] <= secSmall&&arr[i]!=small) {
				secSmall = arr[i];
			}

		}
		System.out.println("small" + small);
		System.out.println("Sec Small " + secSmall);
	}

}
