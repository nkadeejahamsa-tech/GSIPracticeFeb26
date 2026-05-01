package day10;

class Parent{
	final int num=12;
	protected void print() {
		System.out.println("Hello");
	}
	
}
class Child extends Parent{
	void bye() {
		this.num = 13;
	}
	void print() {
		System.out.println("Hello");
	}
}

public class Program_AccessInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
