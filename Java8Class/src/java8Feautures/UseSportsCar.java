package java8Feautures;

public class UseSportsCar {
	
	public static void main(String[] args) {
		
		System.out.println(Vehicle.engineType());
		
		SportsCar sc = new SportsCar();
		System.out.println(sc.calculateSpeed(150));
		
		System.out.println(sc.fuelUsage());
	}

}
