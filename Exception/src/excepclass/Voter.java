package excepclass;

import java.util.Scanner;

public class Voter {
	
	public static void main(String[]args) throws AgeException {
		
		System.out.println("welcome");
		 
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER YOUR NAME");
		String name = s.nextLine();
		System.out.println(name);
		
		System.out.println("ENTER YOUR AGE");
		int age = s.nextInt();
		if(age>18) {
			System.out.println("eligible");
		}
		else {
			//System.out.println("not eligible");
			throw new AgeException("your age is less");
		}
		
		System.out.println("ENTER YOUR GENDER");
		String gender = s.next();
		System.out.println(gender);
		
		System.out.println("thankyou");	
		
	}

}
