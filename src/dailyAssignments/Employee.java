package dailyAssignments;

public class Employee {
	private String  name;
	private int id;
	private String department;
	Employee( String name1,int id1,String dept){
		name=name1;
		id=id1;
		department=dept;
	}
	Employee( String name1,int id1){
		name=name1;
		id=id1;
		department="General";
	}
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name=name1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id1) {
		this.id = id1;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String dept) {
		this.department = dept;
	}
	

}
