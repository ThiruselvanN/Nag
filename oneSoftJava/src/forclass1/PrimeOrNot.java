package forclass1;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		int a = 7;
		boolean b = true;
		
		for(int i =2; i<a; i++) {
			
			if(a%i==0) {
			 b = false;
			}
		}System.out.println(b);
		
	}

}
