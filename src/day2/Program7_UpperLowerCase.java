package day2;

public class Program7_UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '1';
//		int value = (int)ch;
		if(ch>='A' && ch<='Z') {
			System.out.println("Uppercase");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("Lower case");

	}
		else if(ch>='0' && ch<='9')
			System.out.println("digit");
	else {
		System.out.println("Spl Character");
	}

}
}
