package arrayList;

public class Laptop {
	
	private String brand;
	private String color;
	private String core;
	private String gen;
	private int price;
	private int ram;
	private boolean isTouch;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setCore(String core) {
		this.core=core;
	}
	public String getCore() {
		return core;
	}
	public void  setGen(String gen) {
		this.gen=gen;
	}
	public String getGen() {
		return gen;
	}
	public void setPrice(int price) {
		this.price=price;
	}
    public int getPrice() {
    	return price;
    }
    public void setRam(int Ram) {
    	this.ram=ram;
    }
    public int getRam() {
    	return ram;
    }
    public void setIsTouch(boolean isTouch) {
    	this.isTouch=isTouch;
    }
    public boolean getIsTouch() {
    	return isTouch;
    }
    
    public Laptop(String brand,String color,String core,String gen,int price,int ram,boolean isTouch) {
    	this.brand=brand;
    	this.color=color;
    	this.core=core;
    	this.gen=gen;
    	this.price=price;
    	this.ram=ram;
    	this.isTouch=isTouch;
    }
    
    public String toString() {
    	return brand+" "+color+" "+core+" "+gen+" "+price+" "+ram+" "+isTouch;
    }
}
