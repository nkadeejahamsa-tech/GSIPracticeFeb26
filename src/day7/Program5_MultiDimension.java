package day7;

public class Program5_MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[][] = { { 99, 100, 98 }, { 78, 100, 93 }, { 56, 40, 30 } ,{67,68,70}};
		for (int row = 0; row <= marks.length-1; row++) {
			for (int col = 0; col <= marks[row].length-1; col++) {
				System.out.print(marks[row][col]+" ");
			}
			System.out.println();
		}
	

}
}

