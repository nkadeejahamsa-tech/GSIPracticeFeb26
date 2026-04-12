package day9;
class StudentUser{
	int enrollNo;
	String Name;
	int age;
}
class EngineeringStudent extends StudentUser{
	String course = "Btech";
	void printData() {
		System.out.print(this.enrollNo+":"+this.Name+":"+this.age);
		if(super.age>25) {
			System.out.print(":Late Admission");
		}
	}
}
public class Program_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngineeringStudent user = new EngineeringStudent();
	
		
		user.enrollNo=101;
		user.Name = "Kadeeja N";
		user.age = 26;
		user.printData();

	}

}
