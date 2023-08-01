package encpsulation;

public class Laptop {
	
	private String brand;
	private int ram;
	private boolean isTouchScreen;
	private int price;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public void setisTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen=isTouchScreen;
	}
	public boolean getisTouchScreen() {
		return isTouchScreen;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public Laptop(String brand, int ram, boolean isTouchScreen, int price) {
		
		this.brand=brand;
		this.ram=ram;
		this.isTouchScreen=isTouchScreen;
		this.price=price;
	}

}
