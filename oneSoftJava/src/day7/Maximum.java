package day7;

public class Maximum {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		int c = 7;
		int d = 3;
		int e = 2;
		
		int[] num = {a,b,c,d,e};
		int max = num[0];
		
		for(int i = 0; i<num.length; i++) {
			
			if(num[i]>=max) {
				max = num[i];
			}
		}
		System.out.println(max);
		
	}

}
