package excepclass;

public class Demo3 {
	
	public static void main(String[] args) {
		
		System.out.println("welcome");
		
		String name = "onesoft";
		
		char c;
		
		try {
			c=name.charAt(8);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("invalid");
		}
		catch(StringIndexOutOfBoundsException ie) {
			System.out.println("notvalid");
			System.out.println(ie);
			ie.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("thank you");
		
	}
	

}
