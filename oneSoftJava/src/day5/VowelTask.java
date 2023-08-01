package day5;

public class VowelTask {
	
	public static void main(String[] args) {
		
		String a = "ehiru";
		char c = a.charAt(0);
		
		//if (a.startsWith("a")||a.startsWith("e")||a.startsWith("i")||a.startsWith("o")||a.startsWith("u")) {
			//System.out.println("yes");
		
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}

}
