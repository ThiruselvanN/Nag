package abstraction;

public class UseVehicle {
	
	public static void main(String[] args) {
		
		Bike b = new Bike();
		System.out.println("Bike : ");
		System.out.println(b.color());
		System.out.println(b.wheel());
		System.out.println(b.price());
		System.out.println(b.milege(75));
		System.out.println("");
		
		Car c = new Car();
		System.out.println("Car : ");
		System.out.println(c.color());
		System.out.println(c.wheel());
		System.out.println(c.price());
		System.out.println(c.milege(100));
	}

}
