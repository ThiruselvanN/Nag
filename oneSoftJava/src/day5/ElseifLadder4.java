package day5;

public class ElseifLadder4 {
	public static void main(String[] args) {
		
		String a = "Thiru";
		char b = a.charAt(0);
	
		
		if(b>='A' && b<='H') {
			System.out.println("A section");
			
		}
		else if(b>='I' && b<='P') {
			System.out.println("B section");
		}
		else if(b>='Q' && b<='z') {
			System.out.println("c section");
		}
		else {
			System.out.println("nothing");
		}
	}

}
