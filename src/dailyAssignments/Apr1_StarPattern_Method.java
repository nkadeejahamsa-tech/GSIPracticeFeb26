package dailyAssignments;

public class Apr1_StarPattern_Method {
static void numPyramid(int n) {
	for (int i = 1; i <= n; i++) {

		for (int spc = i; spc < n; spc++) {
			System.out.print(" ");
		}
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}

		for (int k = i - 1; k >= 1; k--) {
			System.out.print(k);
		}

//	for (int dummy = 1; dummy <= 4; dummy++) {
//		

//		}

		System.out.println();
	}
}
	public static void main(String[] args) {
		numPyramid(7);
		
	}
}
