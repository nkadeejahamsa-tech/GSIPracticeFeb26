package day7;

public class Program4_MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[][] = { { 99, 100, 98 }, { 78, 100, 93 }, { 56, 40, 30 } };
		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col <= 2; col++) {
				System.out.print(marks[row][col]+" ");
			}
			System.out.println();
		}

	}

}
