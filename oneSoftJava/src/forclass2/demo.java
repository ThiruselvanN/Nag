package forclass2;

public class demo {
	
	public static void main(String[]args) {
		
		int [] num = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 1; i<num.length; i++) {
			
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		
	}

}
