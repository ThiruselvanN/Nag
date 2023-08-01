package day3;

public class StringMethods {

	public static void main(String[] args) {

		// 1.toUpperCase
		String name = "Onesoft";
		System.out.println(name.toUpperCase());
		String result = name.toUpperCase();
		System.out.println(result);

		// 2.toLowerCase
		String name2 = "THIRU";
		System.out.println(name2.toLowerCase());
		String result1 = name2.toLowerCase();
		System.out.println(result1);

		// 3.length
		System.out.println(name.length());
		int a = name.length();
		System.out.println(a);

		// 4.concat
		String firstName = "Thiru";
		String secondName = "selvan";
		System.out.println(firstName.concat(secondName));

		// 5.contains
		String word = "Laptop";
		String check = "t";
		boolean result2 = word.contains(check);
		System.out.println(result2);

		// 6.startsWith
		String value1 = "onesoft";
		boolean result3 = value1.startsWith("one");
		System.out.println(result3);

		// 7.endsWith
		String value2 = "onesoft";
		boolean result4 = value2.endsWith("soft");
		System.out.println(result4);

		// 8.equals
		
		String e = "java";
		boolean result5 = e.equals("Java");
		System.out.println(result5);

		// 9.equalsIgnoreCase
		String f = "html";
		boolean result6 = f.equalsIgnoreCase("HTML");
		System.out.println(result6);

		// 10.charAt
		String g = "java";
		char h = g.charAt(3);
		System.out.println(h);
		
		//11.indexOf
		String word1 = "Thiru";
		int index = word1.indexOf('s');
		System.out.println(index);
		
		//12.subString
		String word2 = "Onesoft Technologies";
		String sub = word2.substring(3,7);
		System.out.println(sub);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

