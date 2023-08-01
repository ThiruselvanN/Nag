package forclass2;

public class Minimumnum {
	
	public static void main(String[]args) {
		
		int [] num = {4,3,6,5,2};
		int min = num[0];
		
		for(int i = 0; i<num.length; i++) {
			if(num[i]<=min) {
				min=num[i];
			}
		}System.out.println(min);
	
		
	}

}
