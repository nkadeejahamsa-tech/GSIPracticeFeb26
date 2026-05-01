package day11;

public class Program3_CountDigits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD123E5";
		int sum = 0;
		String temp = "0";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp = temp + str.charAt(i);
				System.out.println("temp" + temp);

			} else {
				int inte = Integer.parseInt(temp);
				sum = sum + inte;
				temp = "0";
			}

		}
System.out.println(sum);
System.out.println(temp);
int result = Integer.parseInt(temp);
System.out.println(result);
		System.out.println(sum + Integer.parseInt(temp));

	}

}
