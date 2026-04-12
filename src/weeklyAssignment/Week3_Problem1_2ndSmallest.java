package weeklyAssignment;

public class Week3_Problem1_2ndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int small =1;
		int[] arr = { 0, 0, 0, 40, 5, 6, 10 };
		int small = arr[0];
		int secSmall = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < small) {
				small = arr[i];
			}

		}
		System.out.println(small);
		for (int i = 0; i < arr.length; i++) {
//			secSmall = arr[0];

			if (arr[i] > small && arr[i] < secSmall) {
				secSmall = arr[i];
			}
//			if(secSmall>small &&arr[i]>sec	Small) {
//				secSmall=arr[i];
//			}

		}
		System.out.println("small" + small);
		System.out.println("Sec Small " + secSmall);
	}

}
