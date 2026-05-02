package day12;

import java.util.LinkedList;

public class Program8_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.addFirst(0);
		list.add(1, 10);
		list.addLast(50);
		System.out.println(list);
		
		

	}

}
