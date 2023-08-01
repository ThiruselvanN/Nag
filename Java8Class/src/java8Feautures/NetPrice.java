package java8Feautures;

@FunctionalInterface
public interface NetPrice {
	
	public int findNetPrice(int price,int tax,int discount);	

}
