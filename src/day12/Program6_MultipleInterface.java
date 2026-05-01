package day12;
interface ParentMom{
	void hello();
	int swimmingFees=1000;
//	int pocketMoney=1000;
	default void call() {
		System.out.println("Beta..idhar aavo");
	}
}
interface ParentDad{
	void hello();
	int badmintonFees=2000;
//	int pocketMoney=2000;
	void bye();
	default void call() {
		System.out.println("Child..idhar aavo");
	}
}
class child implements ParentMom,ParentDad{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello My parents,i need my Simming fees"+swimmingFees+"and my Badminton Fees"+badmintonFees);
	}

	@Override
	public void bye() {
		// TODO Auto-generated method stub
		System.out.println("Bye son");
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		ParentDad.super.call();
	}
	
}

public class Program6_MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentDad pd = new child();
pd.hello();
pd.bye();
	}

}
