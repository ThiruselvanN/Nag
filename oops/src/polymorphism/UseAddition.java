package polymorphism;

public class UseAddition {
	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		System.out.println(a.addition());
		System.out.println(a.addition(2, 3, 4));
	}

}
