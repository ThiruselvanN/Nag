package abstraction;

public class UseSamsung extends Samsung{
	
	public static void main(String[] args) {
		
		Samsung s = new Samsung();
		System.out.println(s.type());
		System.out.println(s.brand());
		System.out.println(s.color());
		System.out.println(s.is5g());
		
		
		
	}

}
