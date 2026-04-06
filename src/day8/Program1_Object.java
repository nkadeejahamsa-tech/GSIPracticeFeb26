package day8;

public class Program1_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student();
s1.name="Rajat";
s1.age = 22;
s1.yrOfExp=7;
s1.checkExperience();
//System.out.println(s1.name+":"+s1.age+":"+s1.yrOfExp);
Student s2=new Student("Kadeeja",28,7);
//System.out.println(s2.name+":"+s2.age+":"+s2.yrOfExp);
s2.setAge(10);
System.out.println(s1.getAge());


	}

}
