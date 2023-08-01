package excepclass;

public class Facebook {
	
	public static void main(String[]args) throws LoginException {
		
		System.out.println("welcome");
		
		String userName = "Thiru";
		String pass = "12345678";
		if(args[0].equals(userName) && args[1].equals(pass)) {
			System.out.println("correct");
		}
		else {
			throw new LoginException("incorrect");
		}
		
		System.out.println("Thank you");
		
	}

}
