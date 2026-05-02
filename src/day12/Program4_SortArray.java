package day12;

import java.util.*;

class StudentK implements Comparable<StudentK> {

	int id;
	String name;

	public StudentK(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(StudentK o) {
		// TODO Auto-generated method stub
//		return this.id-o.id; // returns ascending order
//		return o.id-this.id;  return the descending order for the id
//		return o.name.compareTo(this.name); returns the name in ddescending order
		return this.name.compareTo(o.name); //returns the name in aascending order
	}

}

public class Program4_SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentK obj1 = new StudentK(3, "Ashi");
		StudentK obj2 = new StudentK(1,"Zakariya");
		StudentK obj3 = new StudentK(2,"Mariyam");
		ArrayList<StudentK> list = new ArrayList<StudentK>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		for(StudentK obj:list) {
			System.out.println(obj.id+":"+obj.name);
		}
		Collections.sort(list);
		for(StudentK obj:list) {
			System.out.println(obj.id+":"+obj.name);
		}

	}

}
