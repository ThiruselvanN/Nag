package forclass1;

public class Palindrome {
	public static void main(String[] args) {
		
		String a = "malayalam";
		String b = "";
		
		for(int i= a.length()-1; i>=0; i--) {
			b=b+a.charAt(i);
		}
			if(a.equals(b)) {
				
				System.out.println("PALINDRONE");
			}
			
			else {
				System.out.println("NOT A PALINDROME");
			}
		
	}

}
