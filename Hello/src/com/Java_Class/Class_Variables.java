package com.Java_Class;

public class Class_Variables {

	int a = 30;
    float b= 1.1510f;
    boolean c;
    
    public void method1() {
    	int a=10;
    	System.out.println(a);
    }
    
    public void method2() {
    	int b= 20;
    	System.out.println(b);
    }
    
    public static void main(String[] args) {
		
    	Class_Variables o = new Class_Variables();
    	o.method1();
    	o.method2();
    	System.out.println(o.a);
    	System.out.println(o.b);
    	System.out.println(o.c);
	}

}
