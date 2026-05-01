package day10;
class Test{
	static int num;
	int num2;
	static {
		System.out.println("Static called");
	}
	void hello() {
		System.out.println("Hello "+num+num2);
		bye();
	}
	static void bye() {
		System.out.println("Bye"+num+num2);
	}
}
public class Program_Static_1 {
static {
	System.out.println("Main Block called");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test.num=10;
	}

}
