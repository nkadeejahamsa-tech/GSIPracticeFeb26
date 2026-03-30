package weeklyAssignment;

import java.util.Scanner;

public class Week2_Problem1_Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter n");

		int n = input.nextInt();
//		int n = 100;
		int sum = 0;
		int a = 0;
		int b = 1;
		int i =0;
//		n= n-2;
		System.out.println(n);
		while (i <n) {
			
			System.out.print(a + " ");
			if(sum>=100) {
				break;
			}
			sum = a + b;
			a = b;
			b = sum;
			i++;
						
		}
	/*int count=10;

		int num1=0;

		int num2=1;

		System.out.print(num1+" "+num2+" ");

		int i=1;

		count=count-2;

		while(i<=count)

		{			//num3=3

			int num3=num1+num2;

			System.out.print(num3+" ");

			num1=num2;

			num2=num3;

			i++;

		} */

	}

}
