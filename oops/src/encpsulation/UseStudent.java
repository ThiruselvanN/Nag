package encpsulation;

public class UseStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setName("thiru");
		s1.setAge(18);
		s1.setMark(98);
		System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getMark());
	}

}
