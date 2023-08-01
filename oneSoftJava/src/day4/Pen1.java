package day4;

public class Pen1 {
	public static void main(String[] args) {

		Pen p1 = new Pen();
		String[] a = args[0].split(",");
		System.out.println(p1.brand = a[0].toUpperCase());
		System.out.println(p1.price = Integer.parseInt(a[1]));
		System.out.println(p1.colour = a[2]);
		
		
		Pen p2 = new Pen();
		String[]b = args[1].split(",");
		System.out.println(p2.brand=b[0].toUpperCase());
		System.out.println(p2.price=Integer.parseInt(b[1]));
		System.out.println(p2.colour = a[2]);
		
		Pen p3 = new Pen();
		String[]c = args[2].split(",");
		System.out.println(p3.brand=c[0].toUpperCase());
		System.out.println(p3.price=Integer.parseInt(c[1]));
		System.out.println(p3.colour=c[2]);
		
		
	

	}

}
