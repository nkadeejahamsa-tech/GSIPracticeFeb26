package day11;

import java.util.*;

public class Program1_ListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList);
		List<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(60);
		arrayList2.add(70);
		arrayList.addAll(arrayList2);
		System.out.println(arrayList);
		System.out.println("Contains"+arrayList.contains(100));
		System.out.println("Get"+arrayList.get(0));
		System.out.println("Size"+arrayList.size());
		arrayList.remove(0);
		System.out.println("Remove "+arrayList);
		System.out.println("Index of 70"+arrayList.indexOf(70));
		System.out.println("Is emplty "+arrayList.isEmpty());
		arrayList.set(0, 200);
		System.out.println("Updated "+arrayList);
	}

}
