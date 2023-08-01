package inheritance;

public class UseElectronic {
	
	public static void main(String[] args) {
		
		Ac ac = new Ac();
		ac.brand="croma";
		System.out.println(ac.brand);
		
		Fridge f = new Fridge();
		f.name="wirlpool";
		System.out.println(f.name);
		
		Tv tv = new Tv();
		tv.color = "black";
		System.out.println(tv.color);
		
		ac.company = "croma";
		System.out.println(ac.company);
		
	}
	
	

}
