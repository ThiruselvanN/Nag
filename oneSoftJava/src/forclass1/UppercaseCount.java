package forclass1;

public class UppercaseCount {
	
	public static void main(String[] args) {
		
		String a = "OneSoFT";
		int upper = 0;
		
		for(int i = 0; i<=a.length()-1; i++) {
			if(a.charAt(i)>='A'&& a.charAt(i)<='Z') {
				upper = upper+1;
				
			}
		}
		     System.out.println(upper);
	}

}
