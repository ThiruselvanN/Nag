package composition;

public class UseTeacher {
	
	public static void main(String[] args) {
		
		MathsTeacher m1 = new MathsTeacher();
		m1.experience = 5;
		m1.qualification = "BE";
		
		Teacher t1 = new Teacher();
		t1.name = "Rajesh";
		t1.gender = "Male";
		t1.salary = 50000;
		t1.subject = "Maths";
		t1.mathsTeacher = m1;
		
		System.out.println(t1.name+" "+t1.gender+" "+t1.salary+" "+t1.subject+" "+t1.mathsTeacher.experience+" "+t1.mathsTeacher.qualification);
		
		
	}

}
