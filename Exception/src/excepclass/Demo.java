package excepclass;

public class Demo {
	
	public static void main(String[]args) {
		
		System.out.println("Welcome");
		
		int a = 5;
		
		int b = 2;
		
		int c = 0;
		
		System.out.println(a+b+c);
		
		try {
		System.out.println(a/c);
		}
		catch(Exception e) {
		//catch(NullPointerException npe) {
			System.out.println("you can not divide any number by 0");
		}
		
		//System.out.println(a/b);
		
		finally {
		System.out.println("Thank You");
		
		}
	}

}
