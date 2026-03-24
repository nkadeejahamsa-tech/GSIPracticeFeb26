package day1;

public class Program4_Casting {
	public static void main(String[] args) {
		//upcasting
		int age = 32;
		float ageFloat = age;
		System.out.println(ageFloat);
		int num = 100;
		long numLong = num;
		System.out.println(numLong);
		
		//down casting
		float ht = 162.5f;
		int height_int = (int)ht;
		
		long ph_num = 98413587456l;
		int phoneInt = (int)ph_num;
		System.out.println(phoneInt);
		
	}
	
	

}
