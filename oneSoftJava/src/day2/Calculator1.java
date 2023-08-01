package day2;

public class Calculator1 {
	
	public static void main(String[] args) {
		
		
		Calculator c1 = new Calculator();
		
		c1.brand="Cassio";
		c1.colour="Black";
		c1.price=100;
		
		System.out.println(c1.findAddition());
		c1.findAddition1();
		System.out.println(c1.findAddition2(5, 5));
		
	}
	
	
	


}
