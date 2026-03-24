package weeklyAssignment;

import java.util.Scanner;

public class Week1_problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		int ascii_value = c;
		System.out.println(ascii_value);
		int ascii_newValue = ascii_value+5;
		c= (char)ascii_newValue;
		System.out.println(c);

	}

}

