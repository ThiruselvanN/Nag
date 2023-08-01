package forclass2;

public class Maximumnum {
	
	public static void main(String[] args) {
		
		int [] num = {4,3,6,5,2};
		int max = num[0];
		
		for(int i = 0; i<num.length; i++) {
			
			if(num[i]>=max) {
				max = num[i];
			}
		}
		System.out.println(max);
	}
	

}
