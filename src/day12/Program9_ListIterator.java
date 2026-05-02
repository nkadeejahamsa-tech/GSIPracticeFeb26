package day12;

import java.util.*;

public class Program9_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		ListIterator<Integer> it = list.listIterator();
		Iterator<Integer> it2= list.iterator();
		

		while (it.hasNext()) {
			System.out.println(it.next() + " ");

		}
		System.out.println(it.previous());
List list3=new ArrayList();
list3.add(10);
list3.add("Hello");
list3.add(10.6);
for(Object o:list3) {
	System.out.print(o+" ");
}
	}

}
