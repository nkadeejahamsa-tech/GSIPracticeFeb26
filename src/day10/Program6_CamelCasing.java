package day10;

import java.util.Arrays;

public class Program6_CamelCasing {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String str = "today is friday ";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if( (arr[i] == ' ')&&i+1<arr.length) {
				arr[i + 1] = Character.toUpperCase(arr[i + 1]);
			}
		}
		String newString = new String(arr);
		System.out.println(newString);

//		String trimmed = str.strip();
//		System.out.println(trimmed);
		String s = newString.replace(" ", "");
		System.out.println(s);

	}

}
