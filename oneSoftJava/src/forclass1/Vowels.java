package forclass1;

public class Vowels {
	
	public static void main(String[] args) {
		
		String a = "java";
		
		for(int i = 0; i<=a.length()-1; i++) {
			
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='0'||a.charAt(i)=='u') {
				System.out.println(a.charAt(i));
			}
			
		}
	}

}
