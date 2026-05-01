package weeklyAssignment;
abstract class Payment{
	int amount;
	abstract void makePayment(int amount);
	void paymentDetails() {
		System.out.println("The Amount is "+amount);
	}
}
class CreditCardPayment extends Payment {
int cardNo=7456;
	@Override
	void makePayment(int amount) {
		this.amount=amount;
		// TODO Auto-	generated method stub
		System.out.println("Paid "+ amount +"using Credit Card ending with"+ cardNo);
	}
	
}
class UPIPayment extends Payment{
String upi_Id = "user@upi";
	@Override
	void makePayment(int amount) {
		this.amount=amount;
		// TODO Auto-generated method stub
		System.out.println("Paid "+amount+" using UPI ID:" +upi_Id);

		
	}
	
}

public class Week7_Apr24_Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment card = new CreditCardPayment();
		Payment upi = new UPIPayment();
		card.makePayment(5000);
		upi.makePayment(9000);
		

	}

}
