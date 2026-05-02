package day12;

import java.util.*;

class Studentj {
	int id;
	String name;

	public Studentj(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

class StudenjComparator implements Comparator<Studentj> {

//	@Override
//	public int compare(Studentj o1, Studentj o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	public int compare(Studentj ob1, Studentj ob2) {
//		return ob2.id - ob1.id; // descending id numbers
//		return ob1.id - ob2.id;  return ascending numbers 
//		return ob1.name.compareTo(ob2.name); // ascending name
		return ob2.name.compareTo(ob1.name); // descending names
				
	}

}

public class Program7_ComparatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentj ob1 = new Studentj(3, "Ashi");
		Studentj ob2 = new Studentj(2, "Zeenat");
		Studentj ob3 = new Studentj(1, "Mehak");
		ArrayList<Studentj> list = new ArrayList<Studentj>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		Collections.sort(list, new StudenjComparator());
		for (Studentj obj : list) {
			System.out.println(obj.id+" : "+obj.name);

		}
	}

}
