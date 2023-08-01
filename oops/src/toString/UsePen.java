package toString;

public class UsePen {
	
	public static void main(String[] args) {
		
		Ink i1 = new Ink("blue", 50);
		
		Pen p1 = new Pen("camlin", 70, "black", i1);
		
		System.out.println(p1);
		
	}

}
