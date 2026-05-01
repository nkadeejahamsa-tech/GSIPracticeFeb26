package day9;

class UserG {
	int id;
	String name;

	public UserG() {
		System.out.println("COnstructor 1 called");
	}

	UserG(int id,String name){
		this();
		this.id=id;
		this.name=name;
		System.out.println("Constructor 2 is called");

	}
	void print() {
		System.out.println(this.id+this.name);
	}
}

public class Program_This2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserG userg = new UserG(121, "Kadeeja");
userg.print();
	}

}
