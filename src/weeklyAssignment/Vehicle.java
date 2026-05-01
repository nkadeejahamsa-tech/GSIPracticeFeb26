package weeklyAssignment;

public class Vehicle {
	String brand;
	int speed;
	static String company = "AutoWordl Ltd";

	Vehicle(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed);
	}
	void run() {
		System.out.println("Vehicle is running");
	}
	 final void engineType() {
		System.out.println("Engine type: Standard Engine");
	}

}
class Car extends Vehicle{
	String fuelType;

	Car(String brand, int speed,String fuelType) {
		this.fuelType=fuelType;
		super(brand, speed);
		System.out.println("Fuel Type:"+fuelType);
		// TODO Auto-generated constructor stub
	}
	void run() {
		super.run();
		System.out.println("Car is running smoothly");
	}
//	 void engineType() {
//		System.out.println("Manual");

	
}
