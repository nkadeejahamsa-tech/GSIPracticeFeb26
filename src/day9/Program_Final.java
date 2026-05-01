package day9;
final class ExamA{
	int examCode=101;
}
//class ExamB extends ExamA{
//	
//}
 class TestP{
	final void display(){
		 System.out.println("Hello");
	 }
 }
 class TestQ extends TestP{
	 void display() {
		 System.out.println("Bye");
	 }
 }
public class Program_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestQ q = new TestQ();
q.display();
	}

}
