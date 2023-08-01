package inheritance;

public class Inheritance_Single {
	
	public void grandfather() {
		System.out.println("gold");
		
	}
	public void father() {
		System.out.println("nagesh");
		
	}
    
	public static void main(String[] args) {
		Inheritance_Single a =  new Inheritance_Single();
		a.grandfather();
		a.father();
	}
}
