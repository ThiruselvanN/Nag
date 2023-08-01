package polymorphism;

public class Method_Overloading {
	
	public void method1() {
		System.out.println("thiru");
	}
	
	public void method1(float a) {
		System.out.println(a);
	}
	
	public void method1(short a, short b) {
		System.out.println(a+b);
	}
	
	public void method1(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Method_Overloading o = new Method_Overloading();
		o.method1();
		o.method1(1.50810f);
		o.method1(1510, 3005);
		o.method1(8103005, 8103005);
	}

}
