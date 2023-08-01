package day2;

public class Car1 {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.brand="Audi";
		c1.colour="Black";
		c1.model="Q5";
		c1.price=5000000;
		c1.tax=5000;
		c1.netprice=c1.price+c1.tax;
		
		System.out.println(c1.brand);
		System.out.println("Netprice " +c1.netprice);
		
		Car c2 = new Car();
		c2.brand="Benz";
		c2.colour="blue";
		c2.model="A450";
		c2.price=6000000;
		c2.tax=6000;
		c2.netprice=c2.price+c2.tax;
		
		System.out.println(c2.brand);
		System.out.println("Netprice " +c2.netprice);
		
		Car c3 = new Car();
		c3.brand="Ford";
		c3.colour="Red";
		c3.model="GT";
		c3.price=4000000;
		c3.tax=4000;
		c3.netprice=c3.price+c3.tax;
		
		System.out.println(c3.brand);
		System.out.println("Netprice " + c3.netprice);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
