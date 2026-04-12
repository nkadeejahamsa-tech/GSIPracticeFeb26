package weeklyAssignment;

public class Person {
String name;
int age;
Person(int age,String name){
	this.age=age;
	this.name=name;
}
}
class Student extends Person{
	int marks;

	Student(int age, String name,int marks) {
		super(age, name);
		this.marks=marks;
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println("marks: "+marks);
		System.out.println("name: "+name);
		System.out.println("age:"+age);
	}
}
