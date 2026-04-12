package weeklyAssignment;

public class Employee {
	int id;
	String name;
	double basicSalary;
	double hra;
	double bonus;
	double totalSalary;

	public Employee(int id, String name, double basicSalary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
//		this.totalSalary=totalSalary;

	}

	public void calculateSalary(double basicSalary) {
		 hra =0.20 * basicSalary;
		 bonus = 0.10 * basicSalary;
		 totalSalary = hra + bonus+basicSalary;
	}
	void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("Total Salary: "+totalSalary);
	}

}
