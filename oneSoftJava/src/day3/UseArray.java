package day3;

public class UseArray {

	public static void main(String[] args) {

		String[] friends = { "sunil", "sushil", "rafik", "sathish", "gokul", "thriu" };
		System.out.println(friends[2]);
		System.out.println(friends.length);

		// 13.toCharArray
		String name = "thiru";
		char[] a = name.toCharArray();
		System.out.println(a[1]);
		System.out.println(a[2]);
		// 14.split
		String b = "javaprogramminglanguage";
		String[] c = b.split("g");
		System.out.println(c[0]);

		// Eg.split
		String d = "Thiruselvan";
		String[] e = d.split("s");
		System.out.println(e[0]);
		System.out.println(e[1]);

	}

}
