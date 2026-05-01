package day10;

public class Program2_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Food is good";
		String str2 = "";
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('F'));
		System.out.println(str2.isEmpty());
		System.out.println(str.isEmpty());
		System.out.println(str.length());
		System.out.println(str.replace(' ', '-'));
		System.out.println(str.substring(2, 8));
		System.out.println(str.toUpperCase());
		String str3 = "      i am Happiest one in the World      ";
		System.out.println(str3.stripLeading());
		System.out.println(str3.stripTrailing());
		System.out.println(str3.trim());
		System.out.println(str3);
		String str4 = "food is good";
		System.out.println(str.equalsIgnoreCase(str4));
		String []words = str4.split(" ");
		System.out.println(words[2]);

	}

}
