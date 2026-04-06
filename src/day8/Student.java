package day8;

public class Student {
	String name;
	int age;
	float yrOfExp;
	void checkExperience() {
		if(yrOfExp>=5) {
			System.out.println("Experienced");
		}
		else {
			System.out.println("Less experienced");
		}
	}
	Student()
	{
		System.out.println("Constructor is called");
	}
	Student(String name1,int age1,float yrofExp1){
		name=name1;
		age=age1;
		yrOfExp=yrofExp1;
		System.out.println("Constructor is called2");
	}
	 String getName() {
		return name;
	}
	 void setName(String name1) {
	  name = name1;
	}
	 int getAge() {
		return age;
	}
	 void setAge(int age1) {
		age = age1;
	}
	 float getYrOfExp() {
		return yrOfExp;
	}
	 void setYrOfExp(float yrOfExp1) {
		yrOfExp = yrOfExp1;
	}
}
