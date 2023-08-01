package functions;

public class UsePractice {
	
	public static void main(String[] args) {
		
		Practice p = new Practice();
		
		System.out.println(p.max(5, 10));
		System.out.println(p.oe(5));
		System.out.println(p.maxs("Thiru", "Selvan"));
		int [] num = {2,3,4,5,6,7};
		p.oddn(num);
		int prime = 5;
		System.out.println(p.findPrime(5));
	}

}
