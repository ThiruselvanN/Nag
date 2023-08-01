package inheritance;

public class Tomato extends Vegetable {
	
	String taste;
	String colour;
	int price;
	String origin;
	
	public Tomato(String name,String nutriants,String taste,String colour,int price,String origin) {
		super(name,nutriants);
		this.taste=taste;
		this.colour=colour;
		this.price=price;
		this.origin=origin;
	}
	public String toString() {
		return taste+" "+colour+" "+price+" "+origin+" "+super.toString();
		
	}

}
