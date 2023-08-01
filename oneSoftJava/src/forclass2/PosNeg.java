package forclass2;

public class PosNeg {
	
	public static void main(StringName[] args) {
		
		int [] num = {-4,6,-2,1,5,3};
		
		int pos = 0;
		int neg = 0;
		
		for(int i =0; i<num.length; i++) {
			
			if(num[i]>0) {
				pos = pos+1;
			}
			else {
				neg = neg+1;
			}
		}
		System.out.println("positive count is " +pos);
		System.out.println("negative count is " +neg);
	}

}
