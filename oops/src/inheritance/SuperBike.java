package inheritance;

public class SuperBike extends Bike {
		
		int cc;
		String colour;
		boolean isAbs;
		
		public SuperBike(String brand,int price,int cc,String colour,boolean isAbs) {
			super(brand, price);
			this.brand=brand;
			this.colour=colour;
			this.isAbs=isAbs;
		}
}
	
	


