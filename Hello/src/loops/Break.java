package loops;

public class Break {
	
	public static void main(String[] args) {
		
		int n=1;
		while(n<=10) {
			System.out.println(n);
			n++;
			
			if(n==6) {
				break;
			}
		}
	}

}
