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
		return this.id-o.id;
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
		Collections.sort(list);
		for(StudentK obj:list) {
			System.out.println(obj.id+":"+obj.name);
		}
	}

}
