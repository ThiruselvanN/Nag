package abstraction;

public class Partial_Implementation extends Partial_Abstraction {
	
	public void method2() {
		System.out.println("rocky");
	}
	
	public void method4() {
		System.out.println("rosy");
	}
	
	public void method6() {
		System.out.println("whitey");
	}
	
	public static void main(String[] args) {
		
		Partial_Implementation o = new Partial_Implementation();
		o.method1();
		o.method2();
		o.method3();
		o.method4();
		o.method5();
		o.method6();
	}

}
