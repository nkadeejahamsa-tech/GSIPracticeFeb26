package day11;

import java.util.Arrays;

public class Program2_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD1234E55";
		int sum = 0;
//		char[] arr = str.toCharArray();
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				int inte = Integer.parseInt(str.charAt(i) + "");

				sum = sum + inte;
			}
		}
System.out.println(sum);
	}

}
