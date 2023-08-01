package day5;

public class ElseifLadder1 {
	public static void main(String[] args) {
		
		int a = 55;
		int b = 65;
		int c = 35;
		
		if(a>b && a>c) {
			System.out.println("a is greater");
			
		}
		else if(b>c && b>a) {
			System.out.println("b is greater");
			
		}
		else {
			System.out.println("c is greater");
		}
	}

}
