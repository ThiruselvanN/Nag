package day6;

public class NewTask {
	
	public static void main(String[] args) {
		
		int num1 = -8;
		int num2 = 10;
		
		int pc =0;
		int nc =0;
		
		for(int i =num1; i<=num2; i++) {
			
			if(i>0) {
				pc++;
			}
			else if(i<0) {
				nc++;
			}
		}
		System.out.println(pc);
		System.out.println(nc);
		
		
	}

}
