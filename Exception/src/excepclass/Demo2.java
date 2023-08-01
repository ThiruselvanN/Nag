package excepclass;

import java.util.Scanner;

public class Demo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Welconme");
		
		System.out.println("Enter the value");
		
		Scanner s = new Scanner(System.in);
		
		String x = s.nextLine();
		 int y = 0;
		try {
		   y = Integer.parseInt(x);
		}
		catch(NullPointerException npe) {
			System.out.println("value is null");	
		}
		catch(NumberFormatException nfe) {
			System.out.println("invalid");
			System.out.println(nfe);
		}
		catch(Exception e) {
			System.out.println("last");
		}
		
		System.out.println(x);
		System.out.println(y);
		
		
		//String name = "thiru";
		//int a = Integer.parseInt(name);
		//System.out.println(name);	
	}

}
