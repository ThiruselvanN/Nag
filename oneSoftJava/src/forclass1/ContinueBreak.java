package forclass1;

public class ContinueBreak {
	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			
			if(i==4||i==6) {
				continue;
			}
			System.out.println(i);
			
		}
		
		for (int j = 1; j<=10; j++) {
			if(j==6) {
				break;
			}
			System.out.println(j);
		}
	}

}
