package day5;

public class StarPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >= 1; i--) {
//System.out.print(" ")
			for (int space = 5; space > i; space--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			}
			System.out.println();
		}
	}

}
