package inheritance;

public class UseSuperBike {
	
	public static void main(String[] args) {
		
		SuperBike s1 = new SuperBike("xyz",100000,1000,"Red",true);
		System.out.println(s1.brand);
		System.out.println(s1.cc+", "+s1.colour);
	}

}
