package dailyAssignments;

public class April01_StarPattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int spc = i; spc < 5; spc++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}

//		for (int dummy = 1; dummy <= 4; dummy++) {
//			

//			}

			System.out.println();
		}

	}
}
