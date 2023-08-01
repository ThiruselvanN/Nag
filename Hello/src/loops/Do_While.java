package loops;

public class Do_While {
	
	public static void main(String[] args) {
		
		int n= 1;
		
		do {
			if (n==5) {
				n++;
				continue;
			}
			
			System.out.println("thiru" +n);
			n++;
			
		}while (n<=8);
	}

}
