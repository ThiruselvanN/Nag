package day5;

public class ElseifLadder2 {
	
	public static void main(String[] args) {
		
		int age = 15;
		
		if (age<12) {
			System.out.println("is a kid");
		}
		else if (age>12 && age<19) {
			System.out.println("is a teenager");
		}
		else if (age>21 && age<45) {
			System.out.println("is adult");
		}
		else {
			System.out.println("senior citizens");
		}
		
	}

}
