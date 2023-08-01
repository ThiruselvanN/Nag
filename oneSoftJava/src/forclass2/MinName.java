package forclass2;

public class MinName {
	
	public static void main(String[] args) {
		
		String [] a = {"thiru","bhuvi","kasth","nag"};
		String min = a[0];
		
		for(int i = 0; i<a.length; i++){
			if(a[i].length()<=min.length()) {
				min=a[i];
			}
			
		}System.out.println(min);
		
	}

}
