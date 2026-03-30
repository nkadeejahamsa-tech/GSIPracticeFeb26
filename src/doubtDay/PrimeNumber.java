package doubtDay;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}
		}
		if (count > 1)
{
			System.out.println("Not a prime");
		} else {
			System.out.println("Is a prime");
		}

	}
}
