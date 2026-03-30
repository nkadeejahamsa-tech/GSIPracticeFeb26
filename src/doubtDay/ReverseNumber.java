package doubtDay;

public class ReverseNumber {
	public static void main(String[] args) {
		
	
	int num = 12345;
	int reverse=0;
	int digit = 0;
	for(int i = 0;num>0;i++) {
		digit = num%10;
		reverse = reverse*10+digit;

		num=num/10;
	}
	System.out.print(reverse);
//		while(true) {
//			System.out.println("hello");
//		}
}
}

