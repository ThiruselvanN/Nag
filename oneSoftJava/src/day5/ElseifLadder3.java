package day5;

public class ElseifLadder3 {
	
	public static void main(String[] args) {
		
		int a = 95;
		
		if (a>90 && a<=100) {
			System.out.println("S grade");
		}
		else if (a>80 && a<=90) {
			System.out.println("A grade");
		}
		else if (a>70 && a<=80) {
			System.out.println("B grade");
		}
		else if (a>50 && a<=70) {
			System.out.println("c grade");
		}
		else if (a>=35 && a<=50) {
			System.out.println("D grade");
		}
		else if (a>=0 && a<35) {
			System.out.println("Fail");
		}
		else {
			 System.out.println("Not a marks");
		}
		
	}

}
