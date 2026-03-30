package day3;

public class Program12_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int num =12121;
				int originalNum=num;
				int reverse = 0;
				while(num>0) {
					int lastDigit = num%10;
					reverse = reverse*10+lastDigit;
					num = num/10;
					
				}
				System.out.println(reverse);
				if(reverse==originalNum) {
					System.out.println("palindrome");
				}
				else {
					System.out.println("Not palindrome");
				}

			}
	

	
}
