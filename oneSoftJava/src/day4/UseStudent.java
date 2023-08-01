package day4;

public class UseStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		String[]a = args[0].split(",");
		s1.name=a[0];
		System.out.println(s1.marks=Integer.parseInt(a[1]));
		s1.isPass = Boolean.parseBoolean(a[2]);
		
		Student s2 = new Student();
		String[]b = args[1].split(",");
		s2.name = b[0];
		s2.marks=Integer.parseInt(b[1]);
		s2.isPass=Boolean.parseBoolean(b[2]);
		
	}

}
