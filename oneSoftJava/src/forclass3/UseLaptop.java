package forclass3;

public class UseLaptop {
	public static void main(String[] args) {
		
		Laptop lap1 = new Laptop();
		lap1.brand = "hp";
		lap1.colour = "black";
		lap1.price=700000;
		lap1.discountPercentage=10;
		
		Laptop lap2 = new Laptop();
		lap2.brand = "dell";
		lap2.colour = "black";
		lap2.price=600000;
		lap2.discountPercentage=15;
		
		Laptop lap3 = new Laptop();
		lap3.brand = "lenova";
		lap3.colour = "black";
		lap3.price=500000;
		lap3.discountPercentage=20;
		
		Laptop [] laps = {lap1,lap2,lap3};
		int total = 0;
		int count = 0;
		for(Laptop l : laps) {
			l.discountAmount=(l.price*l.discountPercentage)/100;
			l.netPrice=l.price-l.discountAmount;
			System.out.println("netprice:"+l.netPrice);
			total = total+l.netPrice;
			count = count+1;
			System.out.println("brand: "+l.brand.toUpperCase());
		}
		System.out.println("avg:" +total/count);
		
		
	}

}
