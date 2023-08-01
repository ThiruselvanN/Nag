package encpsulation;

public class Bike {
	
	private String brand;
	private int price;
	private int cc;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setCc(int cc) {
		this.cc=cc;
	}
	public int getCc() {
		return cc;
	}
	
	public Bike (String brand, int price, int cc) {
		this.brand=brand;
		this.price=price;
		this.cc=cc;
	}
	
	public String toString() {
		return brand+ " "+price+ " "+cc;
	}
		


}
