package java8Feautures;

public interface Furniture {
	
	public default int findPrice(String material,int price) {
		
		if(material.equalsIgnoreCase("wood")) {
			return price+5000;
		}
		else {
			return price;
		}
	}
	
	public static String durability(String material) {
		if(material.equalsIgnoreCase("wood")) {
			return "long durable";
		}
		else {
			return "short durable";
		}
	}

}
