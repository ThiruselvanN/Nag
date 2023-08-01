package forclass1;

public class Stringtype {
	public static void main(String[] args) {
		
		String word = "java";
		
		for(int i = 0; i<=word.length()-1; i++) {
			System.out.println(word.charAt(i));
		}
		
		for(int i = word.length()-1; i>=0; i--) {
			System.out.println(word.charAt(i));	
		}
	}

}
