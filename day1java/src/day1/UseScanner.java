package day1;

import java.util.Scanner;

public class UseScanner {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int a = s.nextInt();
		
		System.out.println("Enter your bith year");
		int b = s.nextInt();
		System.out.println(a+b);
	}

}
