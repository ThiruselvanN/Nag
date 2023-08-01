package day5;

public class ElseifLadder5 {
	
	public static void main(String[] args) {
		
		int b = 12;
		
		if(b>=6 && b<=11) {
			System.out.println("Good morn");
			
		}
		else if(b>=12 && b<=15) {
			System.out.println("Good aft");
		}
		else if(b>=16 && b<=18) {
			System.out.println("Good eve");
		}
		else if (b>=19 && b<=24) {
			System.out.println("good nyt");
		}
		else {
			System.out.println("nothing");
		}
		
	}

}
