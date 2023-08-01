
package functions;

public class UseLaptop {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.brand = "hp";
		l1.price = 500000;
		l1.color = "black";
		l1.rating = 4;
		l1.ram = 8;
		
		Laptop l2 = new Laptop();
		l2.brand = "dell";
		l2.price = 1600000;
		l2.color = "black";
		l2.rating = 4;
		l2.ram = 8;
		
		Laptop l3 = new Laptop();
		l3.brand = "acer";
		l3.price = 700000;
		l3.color = "white";
		l3.rating = 4;
		l3.ram = 8;
		
		Laptop l4 = new Laptop();
		l4.brand = "samsung";
		l4.price = 800000;
		l4.color = "white";
		l4.rating = 4;
		l4.ram = 8;
		
		Laptop [] laps  = {l1,l2,l3,l4};
		
		Laptop x = l1.max(laps);
		System.out.println(x.brand+", "+"max: "+x.price+", "+x.color+", "+x.ram);
		
		l1.wc(laps);
		
		Laptop y = l1.maxc(laps);
		System.out.println(y.price);
	}

}
