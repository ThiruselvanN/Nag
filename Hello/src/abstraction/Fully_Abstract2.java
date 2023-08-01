package abstraction;

public class Fully_Abstract2 implements Fully_Abstract,Fully_Abstract1{
	
	public void method1() {
		System.out.println("thiru");
	}
	
	public void method2() {
		System.out.println("bhuvi");
	}
	
	public void method3() {
		System.out.println("rithuska");
	}
	
	public void method4() {
		System.out.println("nagesh");
	}

	public static void main(String[] args) {
		
		Fully_Abstract2 o = new Fully_Abstract2();
		o.method1();
		o.method2();
		o.method3();
		o.method4();
	}
}
