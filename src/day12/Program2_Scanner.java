package day12;

import java.util.Scanner;

public class Program2_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Integer");
int num = sc.nextInt();
System.out.println("The Number Input "+num);
System.out.println("Enter the String");
String string1 = sc.next();
System.out.println("The String Input "+string1);
System.out.println("Enter the Float");
float fl = sc.nextFloat();
System.out.println("The Float Input "+fl);
sc.nextLine();
System.out.println("Enter the Line");

String line= sc.nextLine();
System.out.println("The Line Input "+line);
sc.nextLine();
boolean result =sc.nextBoolean();
System.out.println(result);
	}

}
