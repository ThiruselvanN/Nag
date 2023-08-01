package forclass1;

public class Average {
	
	public static void main(String[] args) {
		
		int total = 0;
		int count = 0;
		
		for(int i = 1; i<=5; i++) {
			total = total+i;
			count = count+1;
		}
		System.out.println(total/count);
	}

}
