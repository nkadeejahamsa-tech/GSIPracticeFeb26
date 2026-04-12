package day8;

class Parent {
	String house;
}

class Child extends Parent {
	String Car;
}

class GrandChild extends Child {
	String biCycle;
}

public class Program3_MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild grandChild = new GrandChild();
		grandChild.house="3BHK";
		grandChild.Car = "i20";
		System.out.println(grandChild.biCycle = "Hero");
		
	}

}
