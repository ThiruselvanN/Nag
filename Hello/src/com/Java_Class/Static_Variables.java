package com.Java_Class;

public class Static_Variables {
	
	static int a = 30;
	static float b = 1.3005f;
	static boolean c=7>5;
	
	public void method1() {
		int a = 10;
		System.out.println(a);
	}
	
	public void method2() {
		int b=20;
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		Static_Variables o = new Static_Variables();
		o.method1();
		o.method2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
