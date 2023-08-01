

package forclass2;

public class fibonacci {

	public static void main(String [] args) {
		
		int num = 7;
		int a = 0;
		int  b = 1;
		int c= 0;
		int sum = 0;
		
		for(int i = 0; i<=num; i++) {
			
			c=a+b;
			sum=sum+a;
			a=b;
			b=c;
			
		}
		System.out.println(sum);
	}

}
