package day6;

public class Palindrome {
	public static void main(String[] args) {
		
		String x = args[0];
		String y = "";
		for ( int i = x.length()-1; i>=0; i--) {
			y = y + x.charAt(i);
		}
		if(x.equals(y)) {
			System.out.println("yes it is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
