package weeklyAssignment;

public class Week2_Problem2_DigitTransform {

	public static void main(String[] args) {
		
		int num = 4444;
		int lastDigit=0;
		int newNumber = 0;
		int revNumber=0;
		int lastDigit2=0;
		// TODO Auto-generated method stub
for(int i =1;num>0;i++) {
	lastDigit= num%10;
	if(lastDigit<=4 && i%2!=0) {
		lastDigit=lastDigit*2;
	}
	else if(i%2==0) {
		lastDigit=1;
	}
	System.out.print(lastDigit);
	num=num/10;
	 revNumber=(revNumber*10)+lastDigit;
	
	
}
while(revNumber>0) {
	 lastDigit2=revNumber%10;
	 revNumber=revNumber/10;
	 newNumber= (newNumber*10)+lastDigit2;
	 
	 
}
//System.out.println("last number "+newNumber);
System.out.println("\n"+newNumber);
	}

}
