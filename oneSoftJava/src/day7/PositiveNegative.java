package day7;

public class PositiveNegative {
	
	public static void main(String[] args) {
		
		int [] num = {-5,-4,-3,-2,0,2,3,4,5};
		int c =0;
		for(int i = 0; i<num.length; i++) {
			if (num[i]>=0 && num[i]<=5 ) {
				
				System.out.println(num[i]);
			}
			else  {
				System.out.println(num[i]);
			
			}c=c+1;
			
		}System.out.println(c);
	}

}
