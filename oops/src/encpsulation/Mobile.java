package encpsulation;

public class Mobile {
	
	private String brand;
	private int price;
	private String color;
	private Sim sim;
	
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
	public void setSim(Sim sim) {
		this.sim=sim;
	}
	public Sim getSim() {
		return sim;
	}

}
