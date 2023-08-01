package com.Java_Class;

public class Primitive_Datatypes {
	public void numeric() {
		byte a = 15;
		short b = 1510;
		int c = 994309943;
		long d = 151030050810l;
		float e = 1.1234f;
		double f = 1.12345678d;
		System.out.println("byte: "+a);
		System.out.println("short: "+b);
		System.out.println("int: "+c);
		System.out.println("long: "+d);
		System.out.println("float: "+e);
		System.out.println("double: "+f);
	}
	
	public void nonnumeric() {
		char g = 'k';
		boolean h = 4>2;
		System.out.println("char: "+g);
		System.out.println("boolean: "+h);
	}
	
	public static void main(String[] args) {
		Primitive_Datatypes obj = new Primitive_Datatypes();
		obj.numeric();
		obj.nonnumeric();
		
	}

}
