package weeklyAssignment;

public class Week2_Problem2_PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2310;
		int fact=0;
		int count = 0;
		int primeFactor=0;
		for(int i =2;i<=num;i++) {
			if(num%i==0) {
				fact = i;
				for(int j = 2;j<=fact;j++) {
					if(fact%j==0) {
						count++;
					}
					
				if(fact==num/2) {
					break;
				}
				}
				if(count ==1) {
					primeFactor=fact;
					System.out.println(primeFactor);
				
				}
			}
		count =0;
		}
		

	}

}
