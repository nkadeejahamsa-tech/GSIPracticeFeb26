package day12;
abstract class Rating{
abstract void rating();
void print() {
	System.out.println("hello");
}
}
class ElectronicRating extends Rating{

	@Override
	void rating() {
System.out.println("3stars");		
	}
	
}

public class Program1_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ElectronicRating rate = new ElectronicRating();
		Rating rate = new ElectronicRating();
		rate.rating();
		rate.print();
	}

	
}
