package day9;
class EmployeeUser{
	int empId;
	String empName;
	int empAge;
	final String company="Samsung Electronics";
	void printData() {
		System.out.println(empId+":"+this.empName);
	}
	 EmployeeUser(int empId,String empName,int empAge) {
		// TODO Auto-generated constructor stub
		this.empId=empId;
		this.empName=empName;
		this.empAge=empAge;
	}
}

public class Program_This {
	
public static void main(String[] args) {
	EmployeeUser emp = new EmployeeUser(101,"Kadeeja",21); 
	emp.printData();
	emp.company = "Freshworks";

}
}
