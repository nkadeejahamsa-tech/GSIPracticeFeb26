package weeklyAssignment;

public class Week6_Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car("hyundai", 120, "Petrol");
		car.run();
		System.out.println("Company: "+Vehicle.company);
		car.engineType();
String reversed = new StringBuilder(car.brand).reverse().toString();
System.out.println(reversed);
System.out.println(car.brand.replaceAll("[yuai]", "*"));
System.out.println(car.brand.equalsIgnoreCase("Hyundai"));
	}

}
