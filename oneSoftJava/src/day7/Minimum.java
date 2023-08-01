package day7;

public class Minimum {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 2;
		int e = 7;
		
		int[]num = {a,b,c,d,e};
		int min = num[0];
		

		for(int i = 0; i<num.length; i++) {
			
			if(num[i]<=min) {
				min = num[i];
			}
		}
		System.out.println(min);
	}

}
