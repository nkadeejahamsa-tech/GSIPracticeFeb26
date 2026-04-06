package day6;

public class Program2_PolyMorphism {
static void add() {
	System.out.println(10);
}
static void add(int num) {
	System.out.println(num);
}
static void add(int num1,int num2) {
	System.out.println(num1+num2);
}
static void add(int num1,float num2) {
	System.out.println(num1+num2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(10);
		add(10,20);
		add(12, 12.5f);

	}

}
