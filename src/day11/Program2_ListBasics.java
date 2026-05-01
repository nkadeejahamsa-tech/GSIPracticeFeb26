package day11;

import java.util.ArrayList;
import java.util.*;

class Employee{
	private int empId;
	private String name;
	public Employee(int empId, String name) {
		
		this.empId = empId;
		this.name = name;
	}
	public int getEmpId() {
		return this.empId;
	}
	public String getName() {
		return name;
	}
	
}
public class Program2_ListBasics {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(200, "Kadee");
		list.add(emp1);
		Employee emp2= new Employee(201, "PichuMani");
		list.add(emp2);
		Employee emp3= new Employee(202, "Eluvan");
		list.add(emp3);
		System.out.println(list); // cant print the values as its a object
		for(Employee emp:list) {
			System.out.println(emp.getEmpId()+":"+emp.getName());
		}

		


	}

}
