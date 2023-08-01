package day4;

public class LastChar {
	
	public static void main(String[] args) {
		
		String a = args[0];
		String b = args[1];
		
		int c = a.length();
		char d = a.charAt(c-1);
		System.out.println(d);
		
		int e = b.length();
		char f = b.charAt(e-1);
		System.out.println(f);
	}
	
	

}
