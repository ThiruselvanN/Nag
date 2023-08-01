package day1;

import java.util.Scanner;

public class UseScanner {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String n=s.next();
		
		System.out.println("Enter your age");
		int a = s.nextInt();
		
		System.out.println("Enter your city");
		String b = s.next();
		
		System.out.println("Enter your CGPA");
		int c = s.nextInt();
		
		System.out.println("Enter your qualification");
		String q = s.next();
		
		System.out.println("MY BIODATA\n" );
		System.out.println("Age= "+a+"\n"+"m"
				+ "City="+b+"\n"+"CGPA="+c+"\n"+n+"\n"+q);
		
	}

}
