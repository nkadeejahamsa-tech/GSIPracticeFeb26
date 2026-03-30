package day4;

public class Practice2_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd = 1;
		int a = 12;
		int b = 18;
		int small = 0;
		int big = 0;
		if (a < b) {
			small = a;
			big = b;
		} else {
			small = b;
			big = a;
		}
		System.out.println(small);
		System.out.println("big" + big);
		for (int i = small; i >= 1; i--) {
			if (small % i == 0) {
				if (big % i == 0) {
					gcd = i;
					System.out.println("Gcd  is " + gcd);
					break;
				}

			}
		}

		/*
		 * for(int fact=1;fact<=small;fact++){ if(small%fact==0 &&big%fact==0) gcd=fact;
		 * } System.out.println(gcd);
		 */ // its without break statement
	}
}
