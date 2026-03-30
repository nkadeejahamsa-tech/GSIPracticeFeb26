package day4;

public class Program7_Continue {
public static void main(String[] args) {
	System.out.println("hello");
	for(int i = 0;i<=10;i++) {
		if(i==5) {
			continue;
		}
		System.out.println(i+" ");
	}
	System.out.println("\nBye");
}
}
