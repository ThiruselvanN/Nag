package day6;

public class BreakContinue {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			
			if(i==5) {
				//System.out.println(i);
				break;
			}
			System.out.println(i);
		}
		
		for(int j = 1; j<=10; j++) {
			
		if(j==5) {
			continue;
			
		}
		    System.out.println(j);
		}
		
	}

}
