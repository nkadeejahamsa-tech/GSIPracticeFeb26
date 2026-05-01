package day12;

public interface Itest {
public static final int num1=10;
int num2=20;
public abstract void hello();
void bye();
//for normal methods --> keyword -- "Default"
default void print() {
	System.out.println("print data");
}
static void getData() {
	System.out.println("Get the data");
}
class Test implements Itest{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello people");
	}

	@Override
	public void bye() {
		// TODO Auto-generated method stub
		System.out.println("Bye People");
	}
	
}
public static void main(String[] args) {
	Itest.getData();
}
}
