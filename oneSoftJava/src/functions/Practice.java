package functions;

public class Practice {
	
	public int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public String oe(int a) {
		if(a%2==0) {
			return "even";
		}else {
			return "odd";
			
		}
		
	}
	public String maxs(String a, String b) {
		if(a.length()>b.length()) {
			return a;
		}
		else {
			return b;
				
			}
		}
	
    public void oddn(int [] num) {
    	for(int i = 0; i<num.length; i++) {
    		if(num[i]%2!=0) {
    			System.out.println(num[i]);
    		}
    	}	
   
    	}
    public String findPrime(int x) {
    	boolean isPrime = true;
    	for(int i = 2; i<x; i++) {
    		if(x%i==0) {
    			isPrime = false;
    		}
    	}
    		if(isPrime==true) {
    			return "prime";
    		}
    		else {
    			return "not prime";
    		}
    		}
    	}
    	
    
    



