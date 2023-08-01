package toString;

public class Pen {
	
	private String brand;
	private int price;
	private String color;
	private Ink ink;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public Pen(String brand, int price, String color, Ink ink) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.ink=ink;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+ink;
	}

}
