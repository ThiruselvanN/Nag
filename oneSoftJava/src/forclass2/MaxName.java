package forclass2;

public class MaxName {
	
	public static void main(String[] args) {
		
		String [] a = {"Thiru","Bhuvana","Kast","Nagesh"};
		String max = a[0];
		
		for(int i = 0; i<a.length; i++) {
			if(a[i].length()>=max.length()) {
				max=a[i];
			}
		}
			System.out.println(max);
		
	}

}
