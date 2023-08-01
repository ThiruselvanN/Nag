package inheritance;

public class UseSuperCar {
	
	public static void main(String[] args) {
		
		SuperCar s1 = new SuperCar();
		s1.cc=1000;
		s1.model="xyz";
		s1.brand="Honda";
		s1.price=5000000;
		s1.colour="black";
		
		System.out.println(s1.cc);
	}

}


