package day6;

public class Program1_checkEven {
static boolean checkEven(int num) {
	if(num%2==0) {
		return true;
	}
	else return false;
}
static void printEven(int num) {
	if(num%2==0) {
		System.out.println("Its even");
	}
	else {
		System.out.println("Not even");
	}
}
static float add(int num1,float num2) {
	float sum = num1+num2;
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean result = checkEven(12);
boolean result1 = checkEven(13);
printEven(25);
System.out.println(result);
System.out.println(result1);
float sumResult = add(12, 12.5f);
System.out.println(sumResult);
	}

}
