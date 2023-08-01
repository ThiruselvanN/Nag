package java8Feautures;

@FunctionalInterface
public interface Calculator {
	
	public int find(int a,int b);

	public static String manipulation() {
		return "arithmetic calculation";
				
	}
	public default void referranceType() {
		System.out.println("Functional Interface is implemented with Lambda Expression(Annonymus type reference)");
	}
 
}
