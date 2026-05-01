package day11;

public class Program5_EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		if(str1==str2) {
			System.out.println("Output1");
		}
		if(str1.equals(str2)) {
			System.out.println("Output2");
		}
		if(str3==str4) {
			System.out.println("Output3");
		}
		if(str3.equals(str4)) {
			System.out.println("Output4");
		}
	}

}
