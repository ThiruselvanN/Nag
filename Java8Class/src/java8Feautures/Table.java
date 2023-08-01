package java8Feautures;

public class Table implements Furniture {
	
	public int findPrice(String material,int price) {
		if(material.equalsIgnoreCase("wood")) {
			return price+2000;
		}
		else {
			return price;
		}
	}

}
