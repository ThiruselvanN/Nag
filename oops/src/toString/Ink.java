package toString;

public class Ink {
	
	private String color;
	private int price;
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public Ink (String color, int price) {
		this.color=color;
		this.price=price;
	}
	public String toString() {
		return color+" "+price;
	}

}
