package doubtDay;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 370;
		int OriginalNum = num;
//		int reverse=0;
		int digit = 0;
		int cubeSum = 0;
		for (; num != 0; num = num / 10) {
			digit = num % 10;

			cubeSum = cubeSum + (digit * digit * digit);

		}
		System.out.println(cubeSum);
		if (OriginalNum == cubeSum) {
			System.out.println("Its Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
