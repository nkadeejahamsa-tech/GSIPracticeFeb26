package dailyAssignments;

public class Employee_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1= new Employee("Unknown",0,"Not Assigned");
Employee e2= new Employee("Priya", 101, "HR");
Employee e3=new Employee("Rahul", 102);
System.out.println(e1.getDepartment());
System.out.println( e3.getDepartment());
e1.setName("Anjali");
e1.setId(103);
e1.setDepartment("Finance");
System.out.println(e1.getDepartment());
System.out.println(e1.getId());
System.out.println(e1.getName());
	}

}
