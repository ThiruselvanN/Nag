package java8Feautures;

public class UseTable {
	
	public static void main(String[] args) {
		
		Table t = new Table();
		
		System.out.println(t.findPrice("wood", 2000));
		
		System.out.println(Furniture.durability("wood"));
		
	}

}