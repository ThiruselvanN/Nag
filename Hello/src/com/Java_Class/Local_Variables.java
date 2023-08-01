package com.Java_Class;

public class Local_Variables {
	
	public void method1() {
		int a = 10;
		System.out.println(a);
	}
	
	public void method2() {
		int b = 20;
		System.out.println(b);
	}
	
	public void method3() {
		int c= 30;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Local_Variables o= new Local_Variables();
		o.method1();
		o.method2();
		o.method3();
	}

}
