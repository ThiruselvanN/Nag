package day5;

public class Task {
	public static void main(String[] args) {
		
		int p = 75;
		int c = 70;
		int m = 80;
		 
		int total = p+c+m;
		int avg = total/3;
		System.out.println(avg);
		
		if(avg>=50) {
			System.out.println("is eligible");
		}
		else {
			System.out.println("is not");
		}
		

	}

}
