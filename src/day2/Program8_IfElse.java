package day2;

public class Program8_IfElse {
	public static void main(String[] args) {
		int age =18;
		char gender ='M';
		if(age==18) {
			System.out.println("Congrats on your first vote");
			if(gender=='F')
			{
				System.out.println("You can vote,Girl");
			}
			else {
				System.out.println("You can vote,Boy");
			}
		}
		 if(age>18) {
			System.out.println("You can Vote");
		}
		else {
			System.out.println("You cant vote");
		}
	}

}
