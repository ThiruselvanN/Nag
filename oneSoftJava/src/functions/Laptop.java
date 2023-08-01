package functions;

public class Laptop {
	
	String brand;
	int price;
	String color;
	int rating;
	int ram;
	
	public  Laptop max(Laptop [] l) {
		Laptop max = l[0];
		for(int i = 0; i<l.length; i++) {
			if(l[i].price>max.price) {
				max=l[i];
			}
			}
		return max;
		}
	public void wc(Laptop [] l) {
		for(int i = 0; i<l.length; i++) {
			if(l[i].color.equals("white")) {
				System.out.println(l[i].brand+ ", "+l[i].color+", "+l[i].price+", "+l[i].ram);
			}
		}
	}
	public Laptop maxc (Laptop [] l) {
		Laptop maxc = l[0];
		for(int i = 0; i<l.length; i++){
			if(l[i].color.equals("white") && l[i].price>maxc.price) {
			   maxc=l[i];
				
			}
		}return maxc;

		
}
}

