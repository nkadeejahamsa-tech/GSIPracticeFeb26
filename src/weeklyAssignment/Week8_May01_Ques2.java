package weeklyAssignment;

import java.util.*;

class Mobile implements Comparable<Mobile> {
	String brand;
	String model;
	float price;

	public Mobile(String brand, String model, float price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return Float.compare(o.price, this.price);
	}

}

public class Week8_May01_Ques2 {

	public static void main(String[] args) {
		int maxIndex = 0;
		// TODO Auto-generated method stub
		Mobile obj5 = new Mobile("Samsung ", "S25", 80000);
		Mobile obj2 = new Mobile("RealMe", "GT", 30000);
		Mobile obj3 = new Mobile("Vivo", "V30", 35000);
		Mobile obj4 = new Mobile("Apple", "iPhone 17", 70000);
		Mobile obj1 = new Mobile("OnePlus", "12", 60000);

		ArrayList<Mobile> list = new ArrayList<Mobile>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);

		for (Mobile obj : list) {
			System.out.println(obj.brand + " " + obj.model + ": " + obj.price);
		}
		System.out.println("-----------------------------------------");
		System.out.println("After Sorting Descending:");
		Collections.sort(list);
		for (Mobile obj : list) {
			System.out.println(obj.brand + " " + obj.model + ": " + obj.price);
		}
		System.out.println("-----------------------------------------");
		System.out.println("After Removing Most Expensive Mobile:");
		list.remove(0);
		for (Mobile obj : list) {
			System.out.println(obj.brand + " " + obj.model + ": " + obj.price);
		}
		System.out.println("-----------------------------------------");
		////		System.out.println(list.size());
//		for(int i = 1;i<list.size();i++) {
//			if(list.get(i).price>list.get(maxIndex).price) {
//				maxIndex=i;
//			}
//		}
//		list.remove(maxIndex);
//		for(Mobile obj:list) {
//			System.out.println(obj.brand+" "+obj.model+": "+obj.price);
//		}
		for (Mobile obj : list) {
			if (obj.brand.equalsIgnoreCase("Vivo")) {
				System.out.println("Brand Found " + obj.brand);
			}
		}
		System.out.println("-----------------------------------------");
		obj3.price=34000;
		for (Mobile obj : list) {
			System.out.println(obj.brand + " " + obj.model + ": " + obj.price);
		}
		

	}

}
