package day4;

public class Practice3_CoPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd = 1;
		int a = 1;
		int b = 7;
		int small = 0;
		int big = 0;
		if (a < b) {
			small = a;
			big = b;
		} else
			small = b;
		big = a;

		for (int i = small; i >= 1; i--) {
			if (small % i == 0) {
				if (big % i == 0) {
					gcd = i;
					System.out.println("Gcd  is " + gcd);
					break;
				}

			}
		}
		if (gcd == 1) {
			System.out.println("The Numbers " + a + "and " + b + "are co prime");
		}

		/*
		 * for(int fact=1;fact<=small;fact++){ if(small%fact==0 &&big%fact==0) gcd=fact;
		 * } System.out.println(gcd);
		 */ // its without break statement
	}

}
