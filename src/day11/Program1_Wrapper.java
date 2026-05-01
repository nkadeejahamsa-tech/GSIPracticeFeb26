package day11;

public class Program1_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =10;
String str = "1230";
num=Integer.parseInt(str);
System.out.println(str);
boolean result = Character.isDigit('9');
boolean result2 = Character.isDigit('t');
boolean result3 = Character.isDigit(num);
System.out.println(result);
System.out.println(result2);
System.out.println(result3);
//AUTO BOXING -->Converting a Primitive type to Wrapper class
Integer num2 = num;
//UNBOXING --> Converting a Wrapper class to primitive type
num=num2;
	}

}
