package day10;

public class Program5_Palindrome {
	public static void main(String[] args) {
		String str = "Madam";
	
		
		String reversed = new StringBuilder(str).reverse().toString();

		if(str.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
