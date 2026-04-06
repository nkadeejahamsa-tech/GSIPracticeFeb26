package day7;

public class Program2_LengthArray {

	private static int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = new int[5];
		height[0] = 1;
		height[2] = 22;
		int length = 0;
		for (int i = 0; i <= 4; i++) {
			if (height[i] != 0) {
				length = length + 1;
				System.out.println(i);

			}
		}
		System.out.println(length + "Size");


	}
}
