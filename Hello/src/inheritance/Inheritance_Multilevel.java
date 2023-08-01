package inheritance;

public class Inheritance_Multilevel extends Inheritance_Single1 {
	
	public void son() {
		System.out.println("thiru");
	}
	
	public static void main(String[] args) {
		
		Inheritance_Multilevel c = new Inheritance_Multilevel();
		c.grandfather();
		c.father();
		c.son();
	}

}
