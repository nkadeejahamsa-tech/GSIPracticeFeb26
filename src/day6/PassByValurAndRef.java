package day6;

public class PassByValurAndRef {
	static void incByFive(int num2) {
		num2=num2+5;
		System.out.println("Inside method" + num2);
	}
	static void incByTwo(int[] num3) {
		num3[0]=num3[0]+2;
		System.out.println("Inside method"+num3[0]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		incByFive(num);
		System.out.println("New Value of Num"+num);
		int[] data = {1,2,3};
		incByTwo(data);
		System.out.println(data[0]);

	}

}
