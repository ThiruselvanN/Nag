package day2;

public class Shirt1 {
	
	public static void main(String[] args) {
		
		
		Shirt s1=new Shirt();
		s1.brand="Allen";
		s1.colour="black";
		s1.price=500;
		s1.discountPercentage=10;
		s1.netprice=s1.price-(s1.price*s1.discountPercentage/100);
		
		System.out.println(s1.netprice);
		
		Shirt s2 = new Shirt();
		s2.brand="peter";
		s2.colour="blue";
		s2.price=600;
		s2.discountPercentage=20;
		s2.netprice=s2.price-(s2.price*s2.discountPercentage/100);
		
		System.out.println(s2.netprice);
		
		Shirt s3 = new Shirt();
		s3.brand="solly";
		s3.colour="white";
		s3.price=1000;
		s3.discountPercentage=25;
		s3.netprice=s3.price-(s3.price*s3.discountPercentage/100);
		
		System.out.println(s3.netprice);
		
		Shirt s4 = new Shirt();
		s4.brand="england";
		s4.colour="red";
		s4.price=2000;
		s4.discountPercentage=50;
		s4.netprice=s4.price-(s4.price*s4.discountPercentage/100);
		
		System.out.println(s4.netprice);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
