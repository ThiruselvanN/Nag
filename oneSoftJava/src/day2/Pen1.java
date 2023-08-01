package day2;

public class Pen1 {
	
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		p1.brand="cello";
		p1.colour="black";
		p1.price=5;
		p1.taxPercentage=30;
		p1.netPrice=p1.price+(p1.price*p1.taxPercentage/100);
		p1.isRefillable=false;
		
		System.out.println(p1.netPrice);
		System.out.println(p1.isRefillable);
		
		Pen p2 = new Pen();
		p2.brand="Reynolds";
		p2.colour="Blue";
		p2.price=10;
		p2.taxPercentage=50;
		p2.netPrice=p2.price+(p2.price*p2.taxPercentage/100);
		p2.isRefillable=true;
		
		System.out.println(p2.netPrice);
		System.out.println(p2.isRefillable);
		
		Pen p3 = new Pen();
		p3.brand="Natraj";
		p3.colour="Red";
		p3.price=15;
		p3.taxPercentage=50;
		p3.netPrice=p3.price+(p3.price*p3.taxPercentage/100);
		p3.isRefillable=false;
		
		System.out.println(p3.netPrice);
		System.out.println(p3.isRefillable);
		
		Pen p4 = new Pen();
		p4.brand="Camlin";
		p4.colour="green";
		p4.price=20;
		p4.taxPercentage=60;
		p4.netPrice=p4.price+(p4.price*p4.taxPercentage/100);
		p4.isRefillable=true;
		
		
		
		
		
		
		
		
		
	}

}
