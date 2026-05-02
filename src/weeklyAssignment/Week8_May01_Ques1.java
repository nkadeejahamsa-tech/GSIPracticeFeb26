package weeklyAssignment;

import java.util.ArrayList;
import java.util.Collections;

class Books implements Comparable<Books> {
	int bookId;
	String bookName;
	float price;

	public Books(int bookId, String bookName, float price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public int compareTo(Books o) {
		// TODO Auto-generated method stub
		return Float.compare(this.price, o.price);
	}

}

public class Week8_May01_Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books ob1 = new Books(1, "Java", 499);
		Books ob2 = new Books(2, "Python", 599);
		Books ob3 = new Books(3, "SQL", 299);
		Books ob4 = new Books(4, "c++", 599);

		ArrayList<Books> list = new ArrayList<Books>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		System.out.println("Original List:");
		for (Books b : list) {

			System.out.println(b.bookId + " " + b.bookName + " " + b.price);
		}
		System.out.println(
				"*********************************************************************************************");

		Collections.sort(list);
		System.out.println("After Sorting By price:");

		for (Books b : list) {
			System.out.println(b.bookId + " " + b.bookName + " " + b.price);

		}
		System.out.println(
				"*********************************************************************************************");
		list.remove(ob2.bookId);
		System.out.println("Removed Book 2");
		for (Books b : list) {
			System.out.println(b.bookId + " " + b.bookName + " " + b.price);

		}
		System.out.println(
				"*********************************************************************************************");
		ob3.price = 699;
		System.out.println("After Updating Price:");

		for (Books b : list) {
			System.out.println(b.bookId + " " + b.bookName + " " + b.price);

		}
		System.out.println(
				"*********************************************************************************************");

		for (Books b : list) {

			if (b.bookName.equalsIgnoreCase("Java")) {
				System.out.println("Book found :" + "" + b.bookName);
			}
		}

		System.out.println(
				"*********************************************************************************************");
		Collections.sort(list);
		for (Books b : list) {
			System.out.println(b.bookId + " " + b.bookName + " " + b.price);

		}
	}
}
