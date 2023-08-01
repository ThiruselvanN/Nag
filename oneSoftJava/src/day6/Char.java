package day6;

public class Char {
	public static void main(String[] args) {
		
		String a = args[0];
		for(int i = 0; i<a.length();i++) {
			System.out.println(a.charAt(i));
			
		}
		for(int j = a.length()-1; j>=0; j--) {
			System.out.println(a.charAt(j));
		}
	}

}
