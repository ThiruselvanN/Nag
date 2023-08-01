package encpsulation;

public class UseLaptop {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("hp",4, true, 500000);
		
		System.out.println(l1.getBrand());
		
		Laptop l2 = new Laptop("Acer",5,true,400000);
		
		System.out.println(l2.getisTouchScreen());
	
		
		
	}

}
