package com.pojo;

public class pojoB {
	
	public static void main(String[] args) {
		
		PojoA p = new PojoA();
		
		int a = p.getA();
		System.out.println(a);
		
		p.setA(99);
		
		int a2 = p.getA();
		System.out.println(a2);
	}

}
