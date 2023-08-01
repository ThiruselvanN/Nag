package com.Java_Class;

import java.util.Scanner;

public class Scanner_Class {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Review:" );
		String a = s.nextLine();
		System.out.println("your review is:"+a );
		
		System.out.println("Rating: ");
		int b = s.nextInt();
		System.out.println("your rating is:"+b );
		
		System.out.println("Hotel Name:" );
		String c = s.next();
		System.out.println("hotel name is:"+c );
		
	}

}
