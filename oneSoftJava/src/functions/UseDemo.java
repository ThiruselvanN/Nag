package functions;

public class UseDemo {
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		d.text = "Hi";
		System.out.println(d.text);
		
		System.out.println(d.name());	
		System.out.println(d.gameLog("Thiru"));
		
		d.endGame();
		d.visit("thiru");
	}

}
