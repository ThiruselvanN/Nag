package java8Feautures;

public class UseNetPrice {
	public static void main(String[] args) {
	
	NetPrice percent = (a,b,c)->a+(a*b/100)-(a*c/100);
	System.out.println(percent.findNetPrice(500000, 10, 5));
	
	NetPrice amount = (a,b,c)->a+b-c;
	System.out.println(amount.findNetPrice(500000,1000,200));
	
	}
}
