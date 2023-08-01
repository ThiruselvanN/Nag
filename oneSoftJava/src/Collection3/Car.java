package Collection3;

public class Car {
	
	private String brand;
	private int price;
	private String color;
	private int rating;
	private String model;
	private String noPlate;
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
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setRating(int rating) {
		this.rating=rating;
	}
	public int getRating() {
		return rating;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setNoPlate(String noPlate) {
		this.noPlate=noPlate;
	}
	public String getNoPlate() {
		return noPlate;
	}
	public void setCc(int cc) {
		this.cc=cc;
	}
	public int getCc() {
		return cc;
	}
	public Car(String brand,int price,String color,int rating,String model,String noPlate,int cc) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.rating=rating;
		this.model=model;
		this.noPlate=noPlate;
		this.cc=cc;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+rating+" "+model+" "+noPlate+" "+cc;
	}
	
}
