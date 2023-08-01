package forclass2;

public class MaximumEnhanced {
	
	public static void main(String[] args) {
		
		int [] num = {22,23,24,21,20};
		int max = num[0];
		int min = num[0];
		
		for(int n : num) {
			
			if(n>=max) {
				max=n;
			}
		}
		System.out.println(max);
		
		
		for(int n1: num) {
			
			if(n1<=min) {
				min=n1;
				
			}
		}
		System.out.println(min);
	}

}
